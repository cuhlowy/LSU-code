//Student Name: Chloe Chin
//LSU ID: 894023599

public class Fibonacci {

	public static int recursiveFib(int n) {
		{
		if (n <= 2)
		return 1;
		else
		return recursiveFib(n-1) + recursiveFib(n-2);
		}
		
	}

	public static long iterativeFib(int n) {
			
		long iFib = 1;
	    long prevIFib = 1;{
	    for (int i = 2; i < n; i++) {
	        if (i <= 2) {
	        	iFib = i;
	        } else {
	            long temp = iFib;
	            iFib += prevIFib;
	            prevIFib = temp;
	        }
	    }
	    return iFib;
	    }
	}
}