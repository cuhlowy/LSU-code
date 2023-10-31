

public class SineUtil
{
    
    private static double factorial(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater than or equal to 0");
        }
        if (n == 0) {
            return 1;
        }        
        return n * factorial(n - 1);    
    }
    
    /**
     * Computes the specified power
     * @param x the base of the power
     * @param n the exponent of the power
     * @return x^n
     * @throw IllegalArgumentException when x = 0 and n <= 0 
     */
    private static double pow(double x, int n)
    {
        if (x == 0 || n <= 0) {
            throw new IllegalArgumentException("Check your input. x must equal 0 or n must be greater than 0");
        }
        	double answer = 1;
        	for (int i = 0; i < n; i++) {
        		answer *= x;
        }
        return answer;
    }    
    
    /**
     * Computes the sine of an angle using the Taylor Series approximation of the
     * sine function and naive exponentiation
     * @param x angle in radians
     * @param n number of terms
     * @return sine(x) = x - x^3/3! + x^5/5! - x^7/7! .....
     * @throw IllegalArgumentException when n <= 0
     */
    public static double naiveSine(double x, int n)
    {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        double a = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                a -= pow(x, 2 * i - 1) / factorial(2 * i - 1);
            } else {
                a += pow(x, 2 * i - 1) / factorial(2 * i - 1);
            }
        }
        return a;
    }    
    
    /**
     * Computes the sine of an angle using the Taylor Series approximation of the
     * sine function and fast exponentiation
     * @param x angle in radians
     * @param n number of terms
     * @return sine(x) = x - x^3/3! + x^5/5! - x^7/7! .....
     * @throw IllegalArgumentException when n <= 0
     */
    public static double fastSine(double x, int n)
    {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        double a = x;
        int denom = 3;
        int factor = -1;
        double base = x;
        for (int i = 2; i < n; i++) {
            base *= (x / denom) * (x / (denom - 1));
            denom += 2;
            a += factor * base;
            factor *= -1;
        }
        return a;
    }
}