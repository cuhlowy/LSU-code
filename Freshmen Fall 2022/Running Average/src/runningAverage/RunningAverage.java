package runningAverage;
import java.util.Scanner;
public class RunningAverage {

public static void main(String arg[]){

       int numOfRunningTimes; 
       double average=0;

       Scanner inputScanner =new Scanner(System.in);
       System.out.println("How many running times would you like to calculate?");


       numOfRunningTimes = inputScanner.nextInt();
 
       int a[] = new int[numOfRunningTimes];
 
       System.out.println("Enter " +numOfRunningTimes+ " numbers:");

       for(int i=0;i<numOfRunningTimes;i++)
       a[i]=(int) inputScanner.nextDouble();
 
       for(int i=0;i<numOfRunningTimes;i++)
       average = average+a[i];

        System.out.println("Running average = " + average/numOfRunningTimes);


            String input = inputScanner.next();
            if(input.equals("done")) {
            System.out.println("You're done! Your running average is " + average/numOfRunningTimes + "!");
            inputScanner.close();
            return;

            }
    }
 
}