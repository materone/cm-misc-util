import org.apache.log4j.*;

public class Log4j {
	final static Logger log = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
//		File f = new File("log4j.properties");
//		System.out.println(f.getAbsolutePath());
		String p = Class.class.getClass().getResource("/").getPath() ;
		PropertyConfigurator.configure(p + "log4j-1.properties");
		// TODO Auto-generated method stub
		log.debug("Hello Debug! slf4j!!!");
		log.info("Info is write!!");
		System.out.println("END " + p);
	}

}
