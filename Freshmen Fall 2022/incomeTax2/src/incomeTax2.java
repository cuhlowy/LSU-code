import java.util.Scanner;
public class incomeTax2 {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner (System.in);
		
	
		double income;
		
		System.out.println("To calculate your income tax, please enter your income: ");
		income = inputScanner.nextDouble();
		
		double tax = 0;
		
		//example given 	
			
		if (income < 12500) {
			tax = income * 0.02;
		}
		else {
			tax += 12500 * 0.02;
			income -= 12500;
		}
		
		
		if (income < (37500)) {
			tax += 37500 * 0.04;
			income -= 37500;
		}
		
		// end of if statement code blocks
		
		System.out.println("Your income tax is " + tax + ".");
	}
}
