package factorfinder;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorFInder {

	        
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		
		System.out.println("Enter in your class grade, followed by how many credit hours it is. \n"
				+ "Please enter “Done” when you are finished.");
		
		
		
		int totalPoints = 0;
		int totalCredits = 0;
		
	boolean moreClasses = false;
		
	do {
			String grade = inputScanner.next();
			
			int gradeValue = 0;
			int credits = 0;
			
			boolean validGrade = true;
			boolean validCredits = true;
			
			do {
				validCredits = true;
				
				String creditsString = inputScanner.next();
				
				try {
					credits  = Integer.parseInt(creditsString);
				}
				catch (NumberFormatException nfe) {
					System.out.println("Please eneter a valid credit number: ");
					validCredits = false;
				}
				
			}
			while(!validCredits);
			
			
			do {
				validGrade = true;
				//grade = inputScanner.next();
					if (grade.equalsIgnoreCase("A")) {
						gradeValue = 4;
					} else if (grade.equalsIgnoreCase("B")) {
						gradeValue = 3;
					} else if (grade.equalsIgnoreCase("C")) {
						gradeValue = 2;
					} else if (grade.equalsIgnoreCase("D")) {
						gradeValue = 1;
					} else if (grade.equalsIgnoreCase("F")) {
						gradeValue = 0;
					} else {
						System.out.println("Please enter a valid grade.");
						validGrade = false;
					}
			}
			while (!validGrade);
			
			
			int points = gradeValue * credits;
			
			totalPoints += points;
			totalCredits += credits;
			
			
			System.out.println("Add another class?");
			String moreClassesString = inputScanner.nextLine();
			
			moreClasses = moreClassesString.equalsIgnoreCase("Yes");
	}
	while (moreClasses);
			
			
			
			int gpa = totalPoints / totalCredits;
			
			
			
			
			//System.out.println("grade: " + grade); 
			//System.out.println("credits: " + totalCredits); //delete 
			//System.out.println("total points: " + totalPoints);
			//System.out.println("GPA: " + gpa);
			
			String input = inputScanner.next();
	            if(input.equals("done")) {
	            System.out.println("You took " +totalCredits+ " hours GPA is " + gpa + ".");
	            inputScanner.close();
	            return;
		
		
	}
}}