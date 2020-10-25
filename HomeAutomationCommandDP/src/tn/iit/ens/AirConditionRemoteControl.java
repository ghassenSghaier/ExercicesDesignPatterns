package tn.iit.ens;

public class AirConditionRemoteControl {
	Command command;	
	public void setCommand(Command c) {
		this.command=c;
	}
	public void turnLightOn() {
		command.execute();
	}
	
}
