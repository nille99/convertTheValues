package com.example.maven.convertTheValues;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class ConvertTest {

	ConversorDegresRadians cdr = new ConversorDegresRadians();
	static final Logger LOG = Logger.getLogger(ConversorDegresRadians.class.getName());
	Random r = new Random();
	
	
	@Test
	public void radiansTest() {
		for(int i = 0; i <10 ;i++) {
			double number = r.nextDouble();
			double result = Math.toRadians(number);

			LOG.info("Testing the method add with" + number );
			assertEquals(cdr.radians(number), result , 0.2);
		}
	}

	@Test
	public void degreesTest() {
		for(int i = 0; i <10 ;i++) {
			double number = r.nextDouble();
			double result = Math.toDegrees(number);

			LOG.info("Testing the method add with" + number );
			assertEquals(cdr.degrees(number), result , 0.2);
		}
	}
	
}
