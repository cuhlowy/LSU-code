package combSort;
import java.util.Random;
public class CombSort {
	

		static long SEED = System.currentTimeMillis();
		static int SIZE = 100;
		static int C_VAL = 7;
		static double K_VAL = 1.314;
		public static void main(String[] args) {
			
			
			int combarr[] = new int[SIZE];
			int bubblearr[] = new int[SIZE];
			
			initArray(combarr);
			initArray(bubblearr);
			
			System.out.println("[*]Starting with SEED = " + SEED);
			printArray(combarr);
			
			BubbleSort(bubblearr);
			printArray(bubblearr);
			System.out.println("<---------------------------->");
			CombSortMethod(combarr,C_VAL,K_VAL);
			printArray(combarr);
			

		}

		
		public static void BubbleSort(int arr[]) {
			boolean done = false;
			int passes = 0; int comparisons = 0;
			while(!done) {
				done = true;
				passes++;
				for(int i = 0; i < arr.length-1; i++) {
					comparisons++;
					if(arr[i] > arr[i+1]) {
						Swap(i,i+1,arr);
						done = false;
					}
				}
			}
			
			System.out.printf("[*]Bubble sort finished in %d passes and %d comparisons\n", passes,comparisons);
		}
		
		public static void CombSortMethod(int arr[], int c, double k) {
			int passes = 0; int comparisons = 0;
			//Implement CombSort Here!
			System.out.printf("[*]Comb sort finished in %d passes and %d comparisons\n", passes,comparisons);
		}
		
		
		public static void Swap(int i, int j, int arr[]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		//Fill arrays with random numbers. Static seed means both arrays receive the same random numbers!
		public static void initArray(int arr[]) {
			Random myRand = new Random(SEED);		
			for(int i = 0; i< arr.length; i++) {
				arr[i] = myRand.nextInt(0,1000);
			}
		}
		//Prints the array
		public static void printArray(int arr[]) {
			System.out.print("[*]The array currently is: ");
			System.out.printf("[");
			for(int i = 0; i < arr.length-1; i++) {
				System.out.printf("%d, ", arr[i]);
			}
			System.out.printf("%d]\n",arr[arr.length-1]);
		}
	}

