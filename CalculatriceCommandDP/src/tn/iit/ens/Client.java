package tn.iit.ens;

public class Client {
	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		PlusCommand plus = new PlusCommand(c);
		MultipCommand mult = new MultipCommand(c);
		SoustCommand sous = new SoustCommand(c);
		CalculatriceControl control = new CalculatriceControl();
		control.setCommand(0, plus);
		control.setCommand(1, sous);
		control.setCommand(2, mult);
		control.MultiButtonPressed(2, 5, 15);
		control.SoustButtonPressed(1, 17, 10);
		control.PlusButtonPressed(0, 12, 15);
	}
}