
public class Singleton {
	
	private volatile static Singleton instance;
	int foss = 0;
	boolean LeadFlag = false;
	{
		LeadFlag = true;
	}
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;		
	}
	
	public static void main(String[] args) {
		Singleton sin = Singleton.getInstance();
		sin.test();
	}
	public void test(){
		System.out.printf("A test,Version:%B HexInt :%H \n",Singleton.getInstance().LeadFlag,Integer.toHexString(18973));
	}
}
