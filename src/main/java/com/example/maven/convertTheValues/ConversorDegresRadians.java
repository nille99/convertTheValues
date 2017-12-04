package com.example.maven.convertTheValues;

public class ConversorDegresRadians {
	public double radians(double number) {
		double radians = Math.toRadians(number);	
		return radians;
	}
	
	public double degrees(double number) {
		double degrees = Math.toDegrees(number);	
		return degrees;
	}
}
