package by.epamtc.dubovik.ballandbasket;

import by.epamtc.dubovik.ballandbasket.entity.*;
import by.epamtc.dubovik.ballandbasket.service.BasketService;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("Введите вместительность корзины (ее максимальный вес):");
		double capacity = ReaderFromConsole.readDouble();
		Basket testBasket = new Basket(capacity);
		System.out.println("Введите количество мячей:");
		int count = ReaderFromConsole.readInt();
		int i = 0;
		while(i < count) {
			System.out.println("Введите вес мяча и его цвет:");
			testBasket.addBall(ReaderFromConsole.readBall());
			++i;
		}
		System.out.println("Вес корзины: " + testBasket.callculateWeight());
		System.out.println("Количество синих мячей: " + BasketService.countColored(testBasket, Color.BLUE));
	}
}
