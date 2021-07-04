package by.epamtc.dubovik.ballandbasket.service;

import org.junit.Test;
import org.junit.Assert;

import by.epamtc.dubovik.ballandbasket.entity.Ball;
import by.epamtc.dubovik.ballandbasket.entity.Basket;
import by.epamtc.dubovik.ballandbasket.entity.Color;
import by.epamtc.dubovik.ballandbasket.service.BasketService;

public class TestBasketService {

	@Test
	public void countColoredTestHasColored() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.BLUE));
		basket.addBall(new Ball(4, Color.BLUE));
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, Color.WHITE));
		int expected = 2;
		int actual = BasketService.countColored(basket, Color.BLUE);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void countColoredTestNoColored() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.GREEN));
		basket.addBall(new Ball(4, Color.BLUE));
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, Color.WHITE));
		int expected = 0;
		int actual = BasketService.countColored(basket, Color.BROWN);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void countColoredTestHasNull() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.GREEN));
		basket.addBall(null);
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, Color.WHITE));
		int expected = 1;
		int actual = BasketService.countColored(basket, Color.WHITE);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void countColoredTestHasNullColor() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.GREEN));
		basket.addBall(new Ball(3, null));
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, Color.WHITE));
		int expected = 1;
		int actual = BasketService.countColored(basket, Color.GREEN);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void countColoredTestCountNullColor() {
		Basket basket = new Basket();
		basket.addBall(new Ball(3, Color.GREEN));
		basket.addBall(new Ball(3, null));
		basket.addBall(new Ball(8, Color.GREY));
		basket.addBall(new Ball(5.8, null));
		int expected = 2;
		int actual = BasketService.countColored(basket, null);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void countColoredTestEmpthyBasket() {
		Basket basket = new Basket();
		int expected = 0;
		int actual = BasketService.countColored(basket, Color.GREEN);
		Assert.assertEquals(expected, actual);
	}
			
	@Test
	public void countColoredTestNullBasket() {
		Basket basket = null;
		int expected = 0;
		int actual = BasketService.countColored(basket, Color.GREEN);
		Assert.assertEquals(expected, actual);
	}		
}
