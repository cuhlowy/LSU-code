//Student Name: Chloe Chin
//LSU ID: 894023599

public class Algorithms {
    
    public static void bubbleSort(int[]array) {
        for(int i = 0; i < array.length - 1; i++) //each iteration of this loop results in the largest unsorted element being "bubbled up" to the last unsorted position in the array
            for(int j = 0; j < array.length - i - 1; j++) //this loop performs pair-wise comparisons of elements, swapping elements if the left is larger than the right
                if(array[j] > array[j + 1]) //if left element larger than right, perform swap
                {
                    int temp = array[j];
                    array[j] = array[j + 1]; 
                    array[j + 1]  = temp;
                }
    }
    
    //Complete Bubble Sort - Short Circuit (15)
    public static void bubbleSortCS(int[]array) {
    	
    	for(int i = 0; i < array.length-1; i++) //ensures array is iterated multiple times until no more swaps needed
    {
	    		boolean swap = false; //checks if any swaps were done in the current iteration and initially sets it to false
	    		for(int j = 0; j < array.length-i-1; j++) //compares elements and swaps them if in wrong order
	    		{
		    		if(array[j] > array[j+1]) // if current element is larger than next, they are swapped
		    		{	
			    	int temp = array[j];
			    	array[j] = array[j+1];
			    	array[j+1] = temp;
			    	swap = true; //variable set to true to indicate that a swap was made 
		    	}
	    	}
	    	if(!swap) //inner loop is finished and swap is still false, means no swaps were made
	    	break; //outer loop exited 
	    }
    }
    
    //Complete Selection Sort (15)
    public static void selectionSort(int[]array) {
    	
    	for (int i = 0; i < array.length - 1; i++) // ensures the entire array is sorted
    	{
	    	int minIndex = i; //variable that keeps track of the index of the minimum element in unsorted parts of the array
	    	
	    	for (int j = i + 1; j < array.length; j++) //runs from element after i to end of array; find the minimum element in the unsorted parts 
	    		if (array[j] < array[minIndex]) //if element less than current minimum is found, this updates the index to the new minimum
	    				minIndex = j;
	    	int smallerNumber = array[minIndex]; //minimum element is swapped with first element in the unsorted parts of the array
	    	array[minIndex] = array[i];
	    	array[i] = smallerNumber;
    	}
    }
    
    //Complete Insertion Sort (15)
    public static void insertionSort(int array[]){
    	
    	for (int i = 1; i < array.length; i++) //iterates through the array and insert each element into its proper position in sorted sublist
    	{
	    	int key = array[i]; //variable used to keep track of current element being inserted into sorted sublist
	    	int j = i - 1; //variable used to iterate the sorted sublist and find correct position for key
	    	while (j >= 0 && array[j] > key) //used to shift elements in sorted sublist for key
	    	{
	    		array[j + 1] = array[j]; 
	    		j = j - 1;
	    	}
	    	array[j + 1] = key; //key is inserted into the correct position in the sorted sublist
	    	}
    }
  
    
    //Complete Merge Sort (15)
    public static void mergeSort(int[] array) {
    	if (array.length < 2)
    		return; //checks is array has less than two elements
    	int mid = array.length / 2; // variable used to find midpoint and split in two halves
    	int[] l = new int[mid]; //left half
    	int[] r = new int[array.length - mid]; //right half
    	
    	for (int i = 0; i < mid; i++) //copies the elements of the left half into new array 
    		l[i] = array[i];
    	for (int i = mid; i < array.length; i++) //copies the elements of the right half into new array 
    		r[i - mid] = array[i];
    	
    	mergeSort(l); //recursively called on the left half of the array
    	mergeSort(r); //recursively called on the right half of the array
    	
    	merge(array, l, r, mid, array.length - mid); //called to merge the sorted left and tight halves of the array back together
    		
    }
	
    private static void merge(int[] array, int[] l, int[] r, int left, int right) {
    	
    	int i = 0, j = 0, k = 0;
    	
    	while (i < left && j < right) { //loop continues as long as i is less than left and j is less than right 
    		if (l[i] <= r[j]) { 
    			array[k] = l[i]; 
    			i++;
    		}
	    	else { 
	    	array[k] = r[j];
	    	j++;
	    	}
	    	k++; //increments k 
    	}
    	
    	while (i < left) //copies any remaining elements in l into array
    		array[k++] = l[i++];
    	while (j < right) //copies any remaining elements in r into array
    		array[k++] = r[j++];
    }

    
    //Optionally complete Quicksort (+5 bonus)
   public static void quicksort(int[] array, int from, int to) {
	   if (from >= to) { 
		   return; }
	   
	   int p = partition(array, from, to);
	   quicksort(array, from, p);
	   quicksort(array, p + 1, to);
    }
	
    private static int partition(int[] array, int from, int to){
    	
    	int pivot = array[from];
    	int i = from - 1;
    	int j = to + 1;
    	
    	while (i < j) {
	    	i++;
	    	while (array[i] < pivot) {
	    		i++;
	    	}
    	
	    	j--;
	    	while (array[j] > pivot) {
	    	j--;
	    	}	
	    	
    	if (i < j) {
	    	array[i] += array[j];
	    	array[j] = array[i] - array[j];
	    	array[i] -= array[j];
	    }
    }
        return 0;
    }
    
}