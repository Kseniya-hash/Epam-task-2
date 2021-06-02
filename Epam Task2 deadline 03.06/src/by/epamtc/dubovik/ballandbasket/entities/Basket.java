package by.epamtc.dubovik.ballandbasket.entities;

import java.util.*;

import by.epamtc.dubovik.ballandbasket.exception.BasketIsOverweightException;

public class Basket implements Iterable<Ball> {
	private List<Ball> basket;
	private double capacity;
	private double weightOfBasket;
	
	public Basket() {
		basket = new LinkedList<Ball>();
		this.capacity = Double.MAX_VALUE;
	}
	
	public Basket(double capacity) {
		basket = new LinkedList<Ball>();
		this.capacity = capacity;
	}
	
	public double getWeightOfBasket() {
		return weightOfBasket;
	}
	
	public  double getCapacity() {
		return capacity;
	}
	
	public void addBall(Ball b) throws BasketIsOverweightException {
		if(!canFitBall(b.getWeight())) {
			throw new BasketIsOverweightException("Ball can not fit in the basket");
		}
		weightOfBasket += b.getWeight();
		basket.add(b);
	}
	
	public boolean canFitBall(double weight) {
		double newFullWeight = weightOfBasket + weight;
		return newFullWeight <= capacity;
	}
	
	public void removeBall(Ball b) {
		boolean isRemoved = basket.remove(b);
		if(isRemoved) {
			weightOfBasket -= b.getWeight();
		}
	}
	
	public void clearBasket() {
		basket.clear();
		weightOfBasket = 0;
	}
	
	public boolean containsBall(Ball b) {
		return basket.contains(b);
	}
	
	public boolean isEmpty() {
		return basket.isEmpty();
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Ball ball : basket){
			str.append(ball.toString() + "\n");
		}
		return str.toString();
	}
	
	public Iterator<Ball> iterator() {
		return new BasketIterator();
	}
	
	private class BasketIterator implements Iterator<Ball>{
		private Iterator<Ball> currentIterator;
		private Ball currentBall;
		
		public BasketIterator() {
			currentIterator = basket.iterator();
		}
		
		@Override
		public boolean hasNext(){
			return currentIterator.hasNext();
		}
		
		@Override
		public Ball next(){
			currentBall = currentIterator.next();
			return currentBall;
		}
		
		@Override
		public void remove() {
			weightOfBasket -= currentBall.getWeight();
			currentIterator.remove();
		}
	}
}
