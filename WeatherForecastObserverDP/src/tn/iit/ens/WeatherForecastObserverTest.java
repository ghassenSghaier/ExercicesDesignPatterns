/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.ens;

/**
 *
 * @author lenovo
 */
public class WeatherForecastObserverTest {

	public static void main(String[] args) {
		StatisticsDisplayObserver sd = new StatisticsDisplayObserver(110, 50, 20);
		ForecastDisplayObserver fd = new ForecastDisplayObserver(120, 40, 33);
		CurrentConditionsDisplayObserver ccd = new CurrentConditionsDisplayObserver(120, 50, 22);
		WeatherData wd = new WeatherData();
		wd.registerObserver(sd);
		wd.registerObserver(fd);
		wd.registerObserver(ccd);
		wd.setTemperature(300);
		wd.setPressure(330);
		wd.setHumidity(330);
		wd.notifyObservers();

		System.out.println("****************************");
		sd.display();
		fd.display();
		ccd.display();
		System.out.println("****************************");

	}

}
