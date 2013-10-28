package fr.treeptik.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import fr.treeptik.wsimport.WeatherReturn;
import fr.treeptik.wsimport.WeatherSoap;

@ManagedBean(name="globalMB")
public class GlobalManagedBean {
	
	@Inject
	private WeatherSoap weatherSoap;

	
	public String getMeteo(){
		
		StringBuilder builder = new StringBuilder();
		WeatherReturn weatherReturn = weatherSoap.getCityWeatherByZIP("10004");
		
		String city = weatherReturn.getCity();
		String temperature = weatherReturn.getTemperature();
		String humidite = weatherReturn.getRelativeHumidity();
		builder.append(city).append(" - ").append(temperature).append(" - ").append(humidite);
		
		return builder.toString();
	}
	

}
