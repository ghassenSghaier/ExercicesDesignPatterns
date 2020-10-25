package tn.iit.ens;

public class Light {
	private boolean lightened;

	public void on() {
		lightened = true;
	}

	public void off() {
		lightened = false;
	}

	public boolean isLightened() {
		return lightened;
	}	
}
