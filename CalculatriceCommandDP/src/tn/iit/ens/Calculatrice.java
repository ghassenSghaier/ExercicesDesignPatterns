package tn.iit.ens;

public class Calculatrice {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int add()
	{
		return x+y;
	}
	public int soust()
	{
		return x-y;
	}
	public int multip()
	{
		return x*y;
	}

}
