package gpaCalculator;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GPAcalculator {

	public static void main(String[] args) {
		
		
	    Scanner inputScanner = new Scanner(System.in);
	    
	    int totalPoints = 0;
	    int totalCredits = 0;
	    
	    boolean moreClasses = false;
	    
	    do {
	    	
	    	System.out.println("Enter in your class's credit hours, followed by your grade.");
			   
		    int credits = 0;
		    boolean validCredits = true;
		    
		    do {
		    	validCredits = true;
		    	
			  
			    String creditsString = inputScanner.next();  
			    
			    try {
			    	credits = Integer.parseInt(creditsString);
			    }
			    catch (NumberFormatException nfe){
				    System.out.println("Please enter a valid integer");
				    validCredits = false;
			    }
			    
		    }
		    while (!validCredits);
		    
		    boolean validGrade = true;
	
		    int gradeValue = 0;
		    String grade = "";
		    
		    do {
		    	validGrade = true;
		    	
			    grade = inputScanner.next();  
			    
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
				    System.out.println("You didn't enter a valid grade :(");
				    validGrade = false;
			    }
		    }
		    while (!validGrade);
		    
		    
		    int points = gradeValue * credits;
		    
		    totalPoints += points;
		    totalCredits += credits;
		    
		    System.out.println("Would you like to enter another class? (Yes/Done)");
		    String moreClassesString = inputScanner.next();  
		    
		    moreClasses = moreClassesString.equalsIgnoreCase("Yes");
		    
	    }
	    while (moreClasses);
	    
	    if (totalCredits < 0 || totalCredits > 19) {
	         System.out.print("ERROR: Too many credits!");
	      } 
	    DecimalFormat df = new DecimalFormat("0.00");

	    Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);
	    
	    String input = inputScanner.next();
        if(input.equals("Done")) {
	    System.out.println("You took a total of "+ totalCredits + " credit hours and your GPA is " +df.format(gpa)+ ".");
	    inputScanner.close();
        return;
	   
	}
	}
	}
	