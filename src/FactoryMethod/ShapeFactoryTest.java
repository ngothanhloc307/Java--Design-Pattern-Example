package FactoryMethod;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {

	ShapeFactory factory = new ShapeFactory();
	Shape roundFood = factory.getFood("Round");
	Shape cylindeFood = factory.getFood("Cylinder");

	@Test
	public void factoryMethod() {
		assertEquals("Round", roundFood.getShape());
		assertEquals("Cylinder", cylindeFood.getShape());
	}



}