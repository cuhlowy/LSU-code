package selectionSort;

import java.util.Scanner;

public class SelectionSort {

	
	public static void main(String[] args) {
		
		System.out.print("Probability of Drawing 3 coins of the Same Type - ");
        System.out.println(coinPurseSimulation(100));
    }

    /**
     Runs numTrials trials of a Monte Carlo simulation of drawing 
     3 coins out of a purse containing 3 pennies and 3 quarters. 
     Coins are not replaced once drawn.
     @param numTrials - the number of times the method will attempt to draw 3 coins
     @returns a double - the fraction of times 3 coins of the same type were drawn.
     */

    public static double coinPurseSimulation(int numTrials) {
        final int P = 1;
        final int Q = 2;
        int [] purse = {Q, Q, Q, P, P, P};
        int [] drawCoins = new int[3];
        for (int draw = 0; draw < 3; draw ++) {
            int index = (int)(Math.random() * purse.length);
            drawCoins[draw] = purse[index];
            int [] newPurse = new int[purse.length-1];
            int j = 0;
            for (int i =0; i < purse.length; i++) {
                if (i == index) {
                    continue;
                }
                newPurse[j] = purse[i];
                j++;
            }
            purse = newPurse;
        }
        double number = 0.0;
        double result = 0.0;
        for (int i = 0; i < numTrials; i++) {
            result++;
            for (int j = 0; j < numTrials;j++) {
                if(drawCoins[0] == drawCoins [1] && drawCoins[1] == drawCoins[2]) {
                    number++;
                }
            }
        }
        return number/result;
    }
}