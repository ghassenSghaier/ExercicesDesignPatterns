package iit.ens.tn;

public class TestAdapter {
	public static void main(String[]args){	
	Turkey turkey = new WildTurkey();
	Duck turkeyAdapter = new TurkeyAdapter(turkey);
	test(turkeyAdapter);
	}
	static void test(Duck tk)
	{
		tk.fly();
		tk.quack();
	}
}
