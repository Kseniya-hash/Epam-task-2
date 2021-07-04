package by.epamtc.dubovik.ballandbasket.service;

import by.epamtc.dubovik.ballandbasket.entity.*;

public class BasketService {
	
	public static int countColored(Basket basket, Color color) {
		int count = 0;
		
		if(basket != null) {
			for(Ball ball : basket){
				if(ball != null && colorEqualsWithNull(ball.getColor(),color)) {
					++count;
				}
			}
		}
		return count;
	}
		
	private static boolean colorEqualsWithNull(Color color1, Color color2) {
		boolean isEqual = false;
		if(color1 != null) {
			isEqual = color1.equals(color2);
		} else {
			isEqual = (color1 == color2);
		}
		return isEqual;
	}
}
