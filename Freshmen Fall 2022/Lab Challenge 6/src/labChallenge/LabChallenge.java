package labChallenge;

import java.util.Random;
import java.util.Scanner;

public class LabChallenge {
	public static void main(String[] args) {

		int number;
		String input = "";
		String done = "finish";
		String almost = "";
	    int upperLimit = 1000;
	    int lowerLimit = 0;
		
		Random rand = new Random();
		Scanner myScanner = new Scanner (System.in);
		
		int randNum = rand.nextInt(0,1001);
		
		System.out.println("Enter a number between 0 and 1000 for me to find.");
		
		do {
			
			input = myScanner.next();
			randNum = (upperLimit + lowerLimit + 1) / 2;
			System.out.println("I think it's " + randNum + ".");
			
			if (input.equals(randNum)) {
				System.out.println("Bye");
				return;
			}
			else {
				number = Integer.parseInt(input);
			}
			
			if (number == randNum) {
				System.out.println("You got the number! Congratulations!");
			}
			else if (number < randNum) {
				System.out.println("I guessed " + randNum + " and  it was too low!");
				lowerLimit = randNum + 1;
			}
			else if (number > randNum) {
				System.out.println("I guessed " + randNum + " and it was too high!");
				upperLimit = randNum - 1;
			}
		
		
	}
		while (number != randNum);
		myScanner.close();
}
}
