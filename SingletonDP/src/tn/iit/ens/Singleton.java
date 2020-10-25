package tn.iit.ens;

public class Singleton {
	private static Singleton instance;
	private Singleton(){}
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}	
	public static void main(String[]args)
	{
		Singleton s = Singleton.getInstance();
	}
}
