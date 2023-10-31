//Student Name: Chloe Chin
//LSU ID: 894023599

public class RecursionProject {

	public static void main (String[] args) {
		
		System.out.printf("%-10s%-15s%-20s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
		System.out.println("==========================================================");
		for(int i = 10; i <= 50; i += 10) {
		//Calculate time in nanosecond for recursive Fibonacci
		long start = System.nanoTime();
		Fibonacci.recursiveFib(i);
		long elapsedRec = System.nanoTime() - start;
		//Calculate time in nanosecond for iterative Fibonacci
		start = System.nanoTime();
		long fib = Fibonacci.iterativeFib(i);
		long elapsedIter = System.nanoTime() - start;
		System.out.printf("%-10d%-15d%,-20d%,-10d\n",i, fib, elapsedRec, elapsedIter);
		}
		System.out.println("==========================================================");
		
		
	}
}
