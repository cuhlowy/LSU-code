package bigBubbleSort;
import java.util.Random;
public class BigBubbleSort {

		static long SEED = System.currentTimeMillis();
		static int SIZE = 25;
		public static void main(String[] args) {
			
			
			int arr[] = new int[SIZE];
			
			
			initArray(arr);
			printArray(arr);
			BubbleSort(arr);
			printArray(arr);
		}
		/*
		 * BubbleSort- sorts array from highest to lowest
		 * @param arr- initializes the array
		 */
		
		public static void BubbleSort(int arr[]) {
			//Implement Bubble Sort!
			int number = 0;
			for(int i = 0;i<arr.length;i++) {
				for(int j = 1; j<(arr.length- i);j++) {
					if(arr[j-1]<arr[j]) {
						number = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = number;
					}
				}
			}
			 }
		
		
		public static void Swap(int i, int j, int arr[]) {
			//You may want to use a swap method to keep your code cleaner, but this is optional!
		}
		/*
		* initArray - Initialize the array with random values for sorting
		* @param arr - The array to initialize
		*/
		public static void initArray(int arr[]) {
			Random myRand = new Random(SEED);
			
			for(int i = 0; i< arr.length; i++) {
				arr[i] = myRand.nextInt(0,1000);
			}
		}
		/*
		* printArray - Prints out each element in an integer array
		* @param arr - The array to print
		*/
		public static void printArray(int arr[]) {
			System.out.print("[*]The array currently is: ");
			System.out.printf("[");
			for(int i = 0; i < arr.length-1; i++) {
				System.out.printf("%d, ", arr[i]);
			}
			System.out.printf("%d]\n",arr[arr.length-1]);
		}
	}


