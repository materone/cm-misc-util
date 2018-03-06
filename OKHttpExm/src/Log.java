
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
	final static Logger log = LoggerFactory.getLogger(Log.class);

	public static void main(String[] args) {
//		File f = new File("log4j.properties");
//		System.out.println(f.getAbsolutePath());
		String p = Class.class.getClass().getResource("/").getPath() ;
		PropertyConfigurator.configure(p + "log4j.properties");
		// TODO Auto-generated method stub
		log.debug("Hello Debug! slf4j!!!");
		log.info("Info is write!!");
		System.out.println("END " + p);
	}

}
