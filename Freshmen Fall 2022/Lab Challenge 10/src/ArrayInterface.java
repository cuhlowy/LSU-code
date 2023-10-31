import java.util.Random;
import java.util.Arrays;
public class ArrayInterface {
		private int classArray[];
		private boolean sorted = false;
		static Random rand = new Random();
		
		/*
		 * ARRAY_INTERFACE - Sets the variable classArray to the imputed array.
		 * 
		 * @array - is the imputed array
		 */
		ArrayInterface(int array[]){
			this.classArray = array;
		}
		
		/*
		 * SortHighToLow - Sorts the array from highest number to lowest number.
		 */
		public void SortHighToLow() {
			boolean swapOccured = false;
			do {
				swapOccured = false;
				for(int i = 0; i < this.classArray.length - 1; i++ ) {
					if(this.classArray[i] < this.classArray[i + 1]) {
						int temp = this.classArray[i];
						this.classArray[i] = this.classArray[i + 1];
						this.classArray[i + 1] = temp;
						swapOccured = true;
					}
				}
			}while(swapOccured);
			sorted = true;
		}
		
		/*
		 * SortLowToHigh - Sorts the array from lowest to highest.
		 */
		public void SortLowToHigh() {
			boolean swapOccured = false;
			do {
				swapOccured = false;
				for(int i = 0; i < this.classArray.length - 1; i++ ) {
					if(this.classArray[i] > this.classArray[i + 1]) {
						int temp = this.classArray[i];
						this.classArray[i] = this.classArray[i + 1];
						this.classArray[i + 1] = temp;
						swapOccured = true;
					}
				}
			}while(swapOccured);
			sorted = true;
		}
		
		/*
		 * Unsort - Randomizes the position of each integer in the array.
		 */
		public void Unsort() {
			for(int i = 0; i < this.classArray.length - 1; i++) {
				int temp1 = rand.nextInt(0, this.classArray.length);
				int temp2 = classArray[i];
				classArray[i] = classArray[temp1];
				classArray[temp1] = temp2;
			}
			sorted = false;
		}
		
		/*
		 * Sorted - Checks to see if the array is sorted.
		 * 
		 * @return - Returns "true" if the array is sorted and "false" if it is not.
		 */
		public boolean Sorted() {
			return sorted;
		}
		
		/*
		 * NumElements - Checks the number of elements currently in the array.
		 * 
		 * @return - Returns the integer value of the number of elements.
		 */
		public int NumElements() {
			return this.classArray.length;
		}
		
		/*
		 * ArrayToString - Turns the array into a string and adds commas in between.
		 * 
		 * @return - Returns the string with all of the elements of the array.
		 */
		public String ArrayToString() {
			String temp= "";
			for(int i = 0; i < this.classArray.length; i++) {
				if(i == 0) {
					temp = Integer.toString(this.classArray[i]);
				}else if(i <= this.classArray.length - 1) {
					temp = temp.concat(", " + Integer.toString(this.classArray[i]));
				}
			}
			return temp;
		}
		 /*
		  * AddToArray - Adds an element to the array. If the array is to small it changes to size to accommodate.
		  */
		public void AddToArray(int num) {
			try {
				classArray[this.classArray.length] = num;
			}catch(Exception e) {
				this.classArray = Arrays.copyOf(this.classArray, this.classArray.length + 1);
				classArray[this.classArray.length - 1] = num;
			}
		}
	}

