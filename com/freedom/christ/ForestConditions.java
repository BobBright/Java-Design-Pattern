package com.freedom.christ;

import java.util.Observable;
import java.util.Observer;

public class ForestConditions implements Observer{

	private float mTemperature;
	private float mPressure;
	private float mHumidity;
	
	public ForestConditions(float mTemperature, float mPressure, float mHumidity) {
		this.mTemperature = mTemperature;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
	}
	
	public ForestConditions() {
	}

	@Override
	public void update(Observable o, Object data) {
		WeatherData.Data w_data=(WeatherData.Data)data;
		this.mTemperature = w_data.mTemperature;
		this.mPressure = w_data.mPressure;
		this.mHumidity = w_data.mHumidity;
		display(mTemperature,mPressure,mHumidity);
	}
	
	private void display(float mTemperature, float mPressure, float mHumidity) {
		System.out.println("ForestConditions Temperature is "+mTemperature);
		System.out.println("ForestConditions Pressure is "+mPressure);
		System.out.println("ForestConditions Humidity is "+mHumidity);
	}

	public float getmTemperature() {
		return mTemperature;
	}
	public void setmTemperature(float mTemperature) {
		this.mTemperature = mTemperature;
	}
	public float getmPressure() {
		return mPressure;
	}
	public void setmPressure(float mPressure) {
		this.mPressure = mPressure;
	}
	public float getmHumidity() {
		return mHumidity;
	}
	public void setmHumidity(float mHumidity) {
		this.mHumidity = mHumidity;
	}
}
