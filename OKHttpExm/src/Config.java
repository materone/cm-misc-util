import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Config {

	public static void main(String[] args) {
		Config conf = new Config();
		try {
			long start = System.currentTimeMillis();
			String rootPath = Config.class.getResource("/").getPath();
			Document doc = conf.parse(rootPath + "DBCPPoolConfig.xml");
			Element ele = doc.getRootElement();
			for (Iterator<Element> eles = ele.elementIterator(); eles.hasNext();) {
				Element node =  eles.next();
				System.out.println(node);	
				System.out.println(node.getName());
			}
			System.out.println("Time:" + (System.currentTimeMillis() - start));
			
			//select single node
			Node node = doc.selectSingleNode("//dbcppool/initialSize");
			System.out.println(node.getName()+":"+node.getText() + ":" + node.getPath());
			

			//walk the dbcppool node
			ele = doc.getRootElement();
			for (Iterator<Element> eles = ele.elementIterator("dbcppool"); eles.hasNext();) {
				ele =  eles.next();				
				System.out.println(ele.getName()+":" + ele.getPath());
				for (int i = 0; i < ele.nodeCount(); i++) {
					node = ele.node(i);
					if(node instanceof Element){
						System.out.println("\t"+node.getName()+":"+node.getText() + ":" + node.getPath());
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Document parse(String file) throws DocumentException{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File(file));
		return doc;
	}

}
