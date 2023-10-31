
public class Operators {
		
		public static void main(String[] args) {
				int x = 10;
				int y = 3;
				System.out.println("x: " + x + " y: " + y);
				x++;
				y--;
				System.out.println("x: " + x + " y: " + y);
				x += 3;
				y = y + 3;
				System.out.println("x: " + x + " y: " + y);
				System.out.println("x + y = " + (x + y));
				
				int result1, result2, result3;
				result1 = x / y;
				result2 = x % y;
				result3 = x * y;
				System.out.println("x: " + x + " y: " + y);
				System.out.println("result 1: " + result1 + ", 2: " + result2 + ", 3: " + result3);
				System.out.println("x > y?: " + (x > y) + " x < y?: " + (x < y));
		}
}
