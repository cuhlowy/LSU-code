 /**
 /**
 * A program to profile sine approximation algorithms that use
 * the Taylor series expansion of the sine function: 
 * sine(x) = x - x^3/3! + x^5/5! - x^7/7! + x^9/9! .....   
 * @author William Duncan, Thien-an Derel Vuong
 * @see SineUtil
 * <pre>
 * Date: 09-04-23
 * Course: csc 3102
 * Project # 0
 * Instructor: Dr. Duncan
 * </pre>
 */

import java.util.Scanner;

public class SineProfiler
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter angle in radians -> ");
        String input = scan.next();
		scan.close();

        double value = Double.valueOf(input);

		double naiveSine = SineUtil.naiveSine(value, 100);
		double fastSine = SineUtil.fastSine(value, 100);

		System.out.println("naive-sine(" + input + ") = " + naiveSine);
		System.out.println("fast-sine(" + input + ") = " + fastSine);

		System.out.println();

		System.out.printf("n\tNaive time (us)\tFast Time (us)\n");

		for (int n = 1000; n <= 6000; n += 1000) {

			double start = System.nanoTime();
			SineUtil.naiveSine(value, n);
			double naive = System.nanoTime() - start;

			start = System.nanoTime();
			SineUtil.fastSine(value, n);
			double fast = System.nanoTime() - start;

			System.out.printf(n + "\t" + naive / 1000 + "\t" + "\t" + fast / 1000 + "\n");		
		}
		for (int n = 7000; n <= 15000; n += 1000) {

			double start = System.nanoTime();
			SineUtil.naiveSine(value, n);
			double naive = System.nanoTime() - start;

			start = System.nanoTime();
			SineUtil.fastSine(value, n);
			double fast = System.nanoTime() - start;

			System.out.printf(n + "\t" + naive / 1000 + "\t" + fast / 1000 + "\n");
		}
	}
}