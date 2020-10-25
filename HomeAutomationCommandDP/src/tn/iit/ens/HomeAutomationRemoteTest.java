package tn.iit.ens;

public class HomeAutomationRemoteTest {
	public static void main(String[] args) {
		AirCondition aircondition = new AirCondition();
		Command airconditioncommand = new AirConditionLightOnCommand(aircondition);
		AirConditionRemoteControl acrc = new AirConditionRemoteControl();
		acrc.setCommand(airconditioncommand);
		acrc.turnLightOn();
	}

}
