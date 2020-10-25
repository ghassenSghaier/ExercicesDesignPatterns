package tn.iit.ens;

public class MultipCommand implements Command {
	private Calculatrice c;
	public MultipCommand(Calculatrice c) {
		this.c=c;
	}
	@Override
	public void execute() {
		System.out.println(c.multip());
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
