package arrayPlayground;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPlayground {
	
	/*
	modifyArray – modifies an index or value in an array  
	printArray - uses array library
	
	@param – array listed {0,1,2,3,4,5,6,7,8,9}; (int index, int value)
	
	@return – true or false 
	*/
	
	public static void main(String[] args) {
		int numsArray[] = {0,1,2,3,4,5,6,7,8,9};
		Scanner numScan = new Scanner(System.in);
		int index, value;
		System.out.println("[*]Enter an index, followed by a number to modify the array at that location or a non-number to end");
		System.out.println("[*] The array is:" + Arrays.toString(numsArray));
		while(true) {
		if(numScan.hasNextInt()) {
		index = numScan.nextInt();
		if(numScan.hasNextInt()) {
		value = numScan.nextInt();
		System.out.printf("Attempting to set index %d to value %d...", index, value);
		             if(modifyArray(numsArray, index, value)) {
		             printArray(numsArray);
		             System.out.println("[*]Enter an index, followed by a number to modify the array at that location or a non-number to end");
		            }
		             }

		else {
		System.out.println("[*]Please enter a valid integer");
		}
		printArray(numsArray);

		}
		else{
		String input = numScan.next();
		if(input.equals("done")) {
		System.out.println("Program closing");
		numScan.close();
		return;

		}
		else {
		System.out.println("[*]Error! Input a valid integer!");
		}
		}

		}

		}

		public static boolean modifyArray(int arr[], int index, int value) {
		if (index >= 0 && index < arr.length) {
		arr[index]= value;
		return true;
		}
		else {
		System.out.println("[*]Error! Input a valid integer!");
		return false;
		}
		}

		public static void printArray(int arr[]) {
		        for (int i = 0; i < arr.length; i++) {
		        System.out.printf("%d " , arr[i]);
		        }
		        System.out.println();
		         
		         }
		}
