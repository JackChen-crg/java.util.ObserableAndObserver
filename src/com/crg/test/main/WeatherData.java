package com.crg.test.main;

import java.util.ArrayList;
import java.util.Observable;

import com.crg.test.Observer;
import com.crg.test.Subject;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
//	private boolean changed;

	public WeatherData() {
//		observers = new ArrayList();
	}

//	public void registerObserver(Observer o) {
//		observers.add(o);
//	}

//	public void removeObserver(Observer o) {
//		int i = observers.indexOf(o);
//		if (i >= 0) {
//			observers.remove(i);
//		}
//	}

//	public void notifyObservers() {
//		if (changed) {
//			for (int i = 0; i < observers.size(); i++) {
//				Observer observer = (Observer) observers.get(i);
//				observer.update(temperature, humidity, pressure);
//			}
//		}
//		changed = false;
//	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/*
	 * 是否通知观察者更新的标志位
	 */
//	public void setChanged() {
//		changed = true;
//	}
	public float getTemperature(){
		return temperature;
	}
	public float getHumidity(){
		return humidity;
	}
	public float getPressure(){
		return pressure;
	}
}
