package tn.iit.ens;

import java.util.HashMap;
import java.util.Map;


public class CalculatriceControl {

	Map<Integer, Command> commands = new HashMap<Integer, Command>();
	public void setCommand(Integer i, Command c) {
		commands.put(i, c);
	}
	public void MultiButtonPressed(Integer i,int x,int y) {
		((MultipCommand) commands.get(i)).getC().setX(x);
		((MultipCommand) commands.get(i)).getC().setY(y);
		commands.get(i).execute();
		
	}
	public void PlusButtonPressed(Integer i,int x,int y) {
		((PlusCommand) commands.get(i)).getC().setX(x);
		((PlusCommand) commands.get(i)).getC().setY(y);
		commands.get(i).execute();
		
	}
	public void SoustButtonPressed(Integer i,int x,int y) {
		((SoustCommand) commands.get(i)).getC().setX(x);
		((SoustCommand) commands.get(i)).getC().setY(y);
		commands.get(i).execute();
		
	}
}
