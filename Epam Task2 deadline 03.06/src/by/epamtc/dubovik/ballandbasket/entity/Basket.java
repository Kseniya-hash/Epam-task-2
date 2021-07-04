package by.epamtc.dubovik.ballandbasket.entity;

import java.util.*;

public class Basket implements Iterable<Ball> {
	private List<Ball> basket;
	private double capacity;
	
	public Basket() {
		basket = new LinkedList<Ball>();
		this.capacity = Double.MAX_VALUE;
	}
	
	public Basket(double capacity) {
		basket = new LinkedList<Ball>();
		this.capacity = capacity;
	}
	
	public  double getCapacity() {
		return capacity;
	}
	
	public double callculateWeight() {
		double weightOfAll = 0;
		
		for(Ball ball : basket) {
			if(ball != null) {
			weightOfAll += ball.getWeight();
			}
		}
		
		return weightOfAll;
	}
	
	public boolean addBall(Ball b) {
		boolean isAdded = false;
		
		if(canFitBall(b)) {
			basket.add(b);
		}
		
		return isAdded;
	}
	
	public boolean canFitBall(Ball ball) {
		boolean canFit = true;
		
		if(ball != null) {
			double newFullWeight = callculateWeight() + ball.getWeight();
			canFit = newFullWeight <= capacity;
		}
		
		return canFit;
	}
	
	public boolean removeBall(Ball b) {
		boolean isRemoved = basket.remove(b);
		
		return isRemoved;
	}
	
	public void clearBasket() {
		basket.clear();
	}
	
	public boolean containsBall(Ball b) {
		return basket.contains(b);
	}
	
	public boolean isEmpty() {
		return basket.isEmpty();
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for(Ball ball : basket){
			str.append(ball.toString() + ", ");
		}
		str.append("]");
		return str.toString();
	}
	
	public Iterator<Ball> iterator() {
		return basket.iterator();
	}
}
