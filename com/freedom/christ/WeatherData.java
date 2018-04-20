package com.freedom.christ;

import java.util.Observable;

public class WeatherData extends Observable{

	private float mTemperature;
	private float mPressure;
	private float mHumidity;
	
	public WeatherData(float mTemperature, float mPressure, float mHumidity) {
		super();
		this.mTemperature = mTemperature;
		this.mPressure = mPressure;
		this.mHumidity = mHumidity;
	}
	
	public WeatherData() {
	}

	public void dataChange(float mTemperature, float mPressure, float mHumidity){
		
		this.setChanged();
		this.notifyObservers(new WeatherData.Data(mTemperature, mPressure, mHumidity));
	}
	
	public class Data{
		
		public float mTemperature;
		public float mPressure;
		public float mHumidity;
		
		public Data(float mTemperature, float mPressure, float mHumidity) {
			this.mTemperature = mTemperature;
			this.mPressure = mPressure;
			this.mHumidity = mHumidity;
		}
	}
}
