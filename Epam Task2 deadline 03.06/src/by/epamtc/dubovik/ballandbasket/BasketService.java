package by.epamtc.dubovik.ballandbasket;

import by.epamtc.dubovik.ballandbasket.entities.*;
import by.epamtc.dubovik.ballandbasket.exception.NullColorException;

public class BasketService {
	
	public static int countColored(Basket basket, Color color) throws NullColorException {
		int count = 0;
		
		for(Ball ball : basket){
			if(color == null) {
				throw new NullColorException("Color can not be null");
			}
			else if(color.equals(ball.getColor()))
				++count;
		}
		return count;
	}
}
