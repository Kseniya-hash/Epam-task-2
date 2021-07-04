package by.epamtc.dubovik.ballandbasket.entity;

import org.junit.Test;
import org.junit.Assert;
import by.epamtc.dubovik.ballandbasket.entity.Basket;

public class TestBasket {
	private static final double DELTA = 0.000001;
	
	@Test
	public void callculateWeightTestPositive() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.BLUE));
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, Color.WHITE));
		double expected = 16.8;
		double actual = basket.callculateWeight();
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void callculateWeightTestWithNull() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.BLUE));
		basket.addBall(null);
		basket.addBall(new Ball(5.8, Color.WHITE));
		double expected = 8.8;
		double actual = basket.callculateWeight();
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void callculateWeightTestEmpthyBasket() {
		Basket basket = new Basket();
		double expected = 0;
		double actual = basket.callculateWeight();
		Assert.assertEquals(expected, actual, DELTA);
	}
	
	@Test
	public void callculateWeightTestZero() {
		Basket basket = new Basket();
		basket.addBall(new Ball(0, Color.BLUE));
		basket.addBall(new Ball(0, Color.WHITE));
		double expected = 0;
		double actual = basket.callculateWeight();
		Assert.assertEquals(expected, actual, DELTA);
	}

}
