package by.epamtc.dubovik.ballandbasket;

import java.awt.Color;

public class RandomBasketGenerator {
	
	public static Basket generateRandomBasket(int sizeOfBasket, 
		                                  double maxWeightOfBall, 
		                                  Color[] VariantColor) throws Exception {
		Basket randomBasket = new Basket();
		
		if (sizeOfBasket < 0)
			throw new Exception("Size of basket can not be below zero");
		for(int i = 0; i < sizeOfBasket; ++i) {
			Ball randomBall = RandomBallGenerator.generateBall(maxWeightOfBall, VariantColor);
			randomBasket.getBasket().add(randomBall);
		}
		return randomBasket;
	}
}
