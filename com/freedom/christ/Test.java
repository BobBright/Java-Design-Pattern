package com.freedom.christ;

public class Test {

	public static void main(String[] args) {
		
		WeatherData observable = new WeatherData();
		CurrentConditions curr_cond = new CurrentConditions();
		ForestConditions fore_cond = new ForestConditions();
		observable.addObserver(curr_cond);
		observable.addObserver(fore_cond);
		observable.dataChange(26.3f, 108.5f, 17.3f);
	}
}
