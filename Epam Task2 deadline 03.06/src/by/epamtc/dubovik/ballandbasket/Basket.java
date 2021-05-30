package by.epamtc.dubovik.ballandbasket;

import java.awt.Color;
import java.util.Collection;
import java.util.LinkedList;

public class Basket {
	private Collection<Ball> basket;
	
	public Basket() {
		basket = new LinkedList<Ball>();
	}
	
	public Collection<Ball> getBasket() {
		return basket;
	}
	
	public String toString() {
		String str = new String();
		
		for(Ball ball : basket){
			str += ball.toString() + "\n";
		}
		return str;
	}
	
	public double calculateWeight() {
		double weightOfAll = 0;
		
		for(Ball ball : basket){
			weightOfAll += ball.getWeight();
		}
		return weightOfAll;
	}
	
	public int countColored(Color color) {
		int count = 0;
		
		for(Ball ball : basket){
			if(color == null) {
				if(ball.getColor() == null)
					++count;
			}
			else if(color.equals(ball.getColor()))
				++count;
		}
		return count;
	}
}
