package by.epamtc.dubovik.ballandbasket;

import java.awt.Color;

public class Runner {
	
	public static void main(String[] args) {
		int sizeOfBasket = 10;
		double maxWeight = 20;
		Color[] arrayOfColors = {Color.BLUE, Color.YELLOW, Color.RED};
		
		try {
			Basket basketOfballs = RandomBasketGenerator.generateRandomBasket(sizeOfBasket,
																	   maxWeight,
																	   arrayOfColors);
			System.out.println("Вес корзины:" + basketOfballs.calculateWeight());
			System.out.println("Количество  синих мячей:"
							   + basketOfballs.countColored(Color.BLUE));
			System.out.println("Корзина:\n" + basketOfballs.toString());
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
