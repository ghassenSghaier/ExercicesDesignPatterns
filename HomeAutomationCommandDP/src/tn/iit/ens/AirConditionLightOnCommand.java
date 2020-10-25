package tn.iit.ens;

public class AirConditionLightOnCommand implements Command{

	AirCondition aircondition;
	
	public AirConditionLightOnCommand(AirCondition aircondition) {
		super();
		this.aircondition = aircondition;
	}

	@Override
	public void execute() {
		aircondition.lightOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
}
