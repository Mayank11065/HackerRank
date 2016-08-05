package pkgJava;

class Singleton{

	public String str;
	
	private Singleton()
	{
		
	}
	static private boolean declared = false;
	static private Singleton singletonInstance;
	static public Singleton getSingleInstance()
	{
		if(!declared)
		{
			declared  = true;
			singletonInstance = new Singleton();
		}
		return singletonInstance;
			
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getSingleInstance();
		Singleton s2 = Singleton.getSingleInstance();
		
		System.out.println(s1.equals(s2));
	}

}
