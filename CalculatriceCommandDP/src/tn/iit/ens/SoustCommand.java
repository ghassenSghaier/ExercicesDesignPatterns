package tn.iit.ens;

public class SoustCommand implements Command {
	private Calculatrice c;
	public SoustCommand(Calculatrice c) {
		this.c=c;
	}
	@Override
	public void execute() {
		System.out.println(c.soust());
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
