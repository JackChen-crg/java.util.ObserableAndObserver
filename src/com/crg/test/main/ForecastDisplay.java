package com.crg.test.main;

import java.util.Observable;
import java.util.Observer;

import com.crg.test.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	public ForecastDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
//	public void update(float temp, float humidity, float presure) {
//		// TODO Auto-generated method stub
//		this.temperature = temp;
//		this.humidity = humidity;
//		this.pressure = presure;
//		display();
//	}


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("我是ForecastDisplay >>>>>>>>>>当前温度为：　" + temperature);
		System.out.println("我是ForecastDisplay >>>>>>>>>当前湿度为：　" + humidity);
		System.out.println("我是ForecastDisplay  >>>>>>>>>当前气压为：　" + pressure);
	}
//	public void removeForecastDisplay(){
//		weatherData.removeObserver(this);
//	}
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
			
		}
	}

}
