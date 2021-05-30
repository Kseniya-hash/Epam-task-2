package by.epamtc.dubovik.ballandbasket;

import java.awt.Color;
import java.util.Random;

public class RandomBallGenerator {
	
	public static Ball generateBall(double maxWeight, Color[] variantColor) throws Exception {
		double ballWeight;
		Color ballColor;
		Ball newBall;
		
		Random rand = new Random();
		ballWeight = rand.nextDouble() * maxWeight;
		ballColor = variantColor[rand.nextInt(variantColor.length)];
		newBall = new Ball(ballWeight, ballColor);
		return newBall;
	}

}
