package guessingGame;

import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[]args) {
		int number;
		String input = "";
		String done = "finish";
		String almost = "";
		
		Random rand = new Random();
		Scanner myScanner = new Scanner (System.in);
		
		int output = rand.nextInt(0,1001);
		System.out.println("I'm thinking of a number....");
		
		do {
			input = myScanner.next();
			
			if (input.equals(output)) {
				System.out.println("Bye");
				return;
			}
			else {
				number = Integer.parseInt(input);
			}
			
			if (number <= (output - 100) || number >= (output +100)) {
				almost = "ICE COLD!";
			}
			else if (number <= (output - 50) || number >= (output + 50)) {
				almost = "YOU'RE CLOSE! TOASTY";
			}
			else if (number < (output) || number >= (output)) {
				almost= "BOILING HOT!";
			}
			if (number == output) {
				System.out.println("You got the number! Congratulations!");
			}
			else if (number < output) {
				System.out.println("You're too low!");
			}
			else if (number > output) {
				System.out.println("You're too high!");
			}
		
		
	}
		while (number != output);
		myScanner.close();
}
}
