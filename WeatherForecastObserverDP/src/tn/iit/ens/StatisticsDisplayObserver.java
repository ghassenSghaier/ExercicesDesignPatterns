package tn.iit.ens;

public class StatisticsDisplayObserver implements Observer, DisplayElement {

	private float temperatureMax, humidityMax, pressureMax;
	
	

	public StatisticsDisplayObserver(float temperatureMax,float humidityMax,float pressureMax) {
		this.temperatureMax=temperatureMax;
		this.humidityMax=humidityMax;
		this.pressureMax=pressureMax;
	}

	@Override
	public void update(float humidity, float temperature, float pressure) {
		if(humidity>humidityMax)
		{	this.humidityMax=humidity;}
		if(temperature>temperatureMax)
		{	this.temperatureMax=temperature;}
		if(pressure>pressureMax)
		{	this.pressureMax=pressure;}
	}
	
	@Override
	public void display() {
		System.out.println("humidity :"+ humidityMax+" \n pressure :"+pressureMax+" \n temperature :"+temperatureMax);
	}
}
