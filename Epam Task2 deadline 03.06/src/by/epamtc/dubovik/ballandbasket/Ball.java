package by.epamtc.dubovik.ballandbasket;

import java.awt.Color;

public class Ball {
	private double weight;
	private Color color;
	
	public Ball() {
		weight = 0;
		color = null;
	}
	
	public Ball(double weight, Color color) throws Exception {
		if(weight < 0) {
			throw new Exception("Weight can not be below zero");
		}
		this.weight = weight;
		this.color = color;
	}
	
	public void setWeight(double weight) throws Exception {
		if(weight < 0) {
			throw new Exception("Weight can not be below zero");
		}
		this.weight = weight;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int hashCode() {
		return color.hashCode() + (int)(31 * weight);
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(this.getClass() != o.getClass())
			return false;
		Ball other = (Ball)o;
		if(this.weight != other.weight)
			return false;
		if(this.color == null)
			return  other.color == null;
		return this.color.equals(other.color);
	}
	
	public String toString() {
		String s = this.getClass().getSimpleName()
				 + ": weight: " + weight + ", color: " + color;
		return s;
	}
}
