package by.epamtc.dubovik.ballandbasket;

import by.epamtc.dubovik.ballandbasket.entities.*;
import exception.*;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("Введите вместительность корзины (ее максимальный вес):");
		double capacity = ReaderFromConsole.readDouble();
		Basket testBasket = new Basket(capacity);
		System.out.println("Введите количество мячей:");
		int count = ReaderFromConsole.readInt();
		for(int i = 0; i < count; ++i) {
			try {
				System.out.println("Введите вес мяча и его цвет");
				testBasket.addBall(ReaderFromConsole.readBall());
			} catch (BasketIsOverweightException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Вес корзины: " + testBasket.getWeightOfBasket());
		try {
		System.out.println("Количество синих мячей: " + BasketService.countColored(testBasket, Color.BLUE));
		} catch(NullColorException e) {
			System.out.println(e.getMessage());
		}
	}
}
