import java.util.Scanner;
public class challenge { //Lab 8 Challenge

	/*
	 * sortArray - Sorts the specified array, according to the given options
	 * @param numArr - references the memory
	 * @return - returns the reference to the same array, now sorted
	 * 
	 * printArray - writes array data to the text area of the Processing environment's console
	 * @param numArr - references the memory
	 * @return - A new line is put between each element of the array
	 */
		public static void main(String[] args) {
			int numArr[] = {86, 59, 12, 43, 1, 99, 27, 94, 75, 4, 98, 32, 12, 44, 16};

			System.out.println("Starting sort with inital array:");
			printArray(numArr);
			sortArray(numArr);
			
			System.out.print("Sorting done!\n");
			printArray(numArr);
			
		}
		
		public static void sortArray(int numArr[]) {
			boolean swapped = false;
			for(int i=0; i<numArr.length-1; i++) {
				int min = i;

				for(int j=i+1; j<numArr.length; j++) {
					if(numArr[j]<numArr[min]) {
						min = j;
					}

				}
				int temp = numArr[i];
				numArr[i] = numArr[min];
				numArr[min] = temp;
				System.out.printf("Min is %d at index %d\n", numArr[i], min);
					if(!(numArr[min]==numArr[i])) {
						System.out.printf("Swapping %d with %d\n", numArr[min], numArr[i]);
						printArray(numArr);
					}else {
						System.out.printf("Min is at correct spot, no swap occurred\n");
					}


			}
		}
		
		public static void printArray(int numArr[]) {
			System.out.print("Array: {");
			
			for(int i=0; i<numArr.length-1; i++) {
				System.out.printf("%d, ",numArr[i]);
			}
			System.out.print(numArr[numArr.length-1]+"}\n");
			
		}
	}
