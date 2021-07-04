package by.epamtc.dubovik.ballandbasket.entity;

import java.io.Serializable;

public class Ball implements Serializable{
	private double weight;
	private Color color;
	
	public Ball() {}
	
	public Ball(double weight, Color color) {
		this.weight = weight;
		this.color = color;
	}
	
	public void setWeight(double weight) {
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
	
	@Override
	public int hashCode() {
		return (int)(color.hashCode() + 31 * weight);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) 
			return true;
		if(o == null) 
			return false;
		if(this.getClass() != o.getClass())
			return false;
		Ball other = (Ball)o;
		if(this.weight == other.weight) {
			if(this.color == null) {
				return other.color == null;
			}
			return this.color.equals(other.color);
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = this.getClass().getSimpleName()
				 + ": " + weight + " " + color;
		return s;
	}
}
