package tn.iit.ens;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
	private float temperature, humidity, pressure;
	private List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

public void setMeasurement(){	
	float temperature = getTemperature();
	float humidity = getHumidity();
	float pressure = getPressure();
}

	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(humidity, temperature, pressure);
		}
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
