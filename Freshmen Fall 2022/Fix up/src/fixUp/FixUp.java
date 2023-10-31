package fixUp;
import java.util.Scanner;
public class FixUp {
	/*
	 
	 GetFeedback - gets and stores information of the feedback from the user
	 
	 @param length (25,50) - how long the presentation was
	 @param good (1,10) - how good the presentation was
	 @param laughs (0,Integer.MAX_VALUE) - how much user laughed 
	 
	 @return - sentence with all the values put in
	 
	*/
	
	static Scanner qScan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int length = -1,good = -1,laughs = -1;
		
		System.out.println("[*]Please enter how long the presentation was (25-50 minutes)");
		length = GetFeedback(25,50);
		System.out.println("[*]Please enter how good you thought the presentation was (1-10)");
		good = GetFeedback (1,10);
		System.out.println("[*]Please enter how many times the presentation made you laugh");
		laughs = GetFeedback(0,Integer.MAX_VALUE);
		System.out.printf("[*]Feedback Received! The presentation was %d minutes, was a %d/10, and made you laugh %d times", length,good,laughs);
	}
		
		
	public static int GetFeedback(int low, int high) {
		int retVal = -1;
		boolean done = false;
		do {
			if(qScan.hasNextInt()) {
				retVal = qScan.nextInt();
				if (retVal < low || retVal > high) {
					System.out.printf("[!]Please enter between %d and %d\n",low,high);
				}
				else {
					done = true;
				}						
			}
			else {
				System.out.println("[!]Please enter a number");
			}
		} while (!done);
		
		return retVal;
	}
	}