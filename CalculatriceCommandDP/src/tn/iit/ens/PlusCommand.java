package tn.iit.ens;

public class PlusCommand implements Command {
	private Calculatrice c;
	
	public PlusCommand(Calculatrice c) {
		this.c=c;
	}
	@Override
	public void execute() {
		System.out.println(c.add());
	}
	@Override
	public void undo() {
		c.setX(0);
		c.setY(0);
	}
	public Calculatrice getC() {
		return c;
	}
	public void setC(Calculatrice c) {
		this.c = c;
	}
	

}
