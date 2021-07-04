package by.epamtc.dubovik.ballandbasket;

import java.util.Scanner;

import by.epamtc.dubovik.ballandbasket.entity.*;

public class ReaderFromConsole {
	
	static public int readInt() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextInt()) {
			in.next();
		}
		return in.nextInt();
	}
	
	static public double readDouble() {
		Scanner in = new Scanner(System.in);
		
		while (!in.hasNextDouble()) {
			in.next();
		}
		return in.nextDouble();
	}
	
	static public Color readColor() {
		while(true) {
			Scanner in = new Scanner(System.in);
			String colorStr = in.nextLine();
			try {
				Color colorFromConsole = Color.valueOf(colorStr.toUpperCase());
				return colorFromConsole;
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static Ball readBall() {
		double weight = readDouble();
		Color color = readColor();
		Ball ballFromConsole = new Ball(weight,color);
		return ballFromConsole;
	}
}
