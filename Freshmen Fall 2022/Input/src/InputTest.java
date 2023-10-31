
import java.util.Scanner;
public class InputTest {
		
		public static void main(String[] args) {
			String name;
			Scanner inputScanner = new Scanner(System.in);
			System.out.println("Hello! What is your name?");
			name = inputScanner.nextLine();
			
			System.out.println("Hello " + name + ",nice to meet you!");
			System.out.println("How old are you?");
			double age = inputScanner.nextDouble();
			final double MILLISECONDS_TO_YEARS = 0.00000000003169;
	System.out.println(age + "? I am about " + (int)(System.currentTimeMillis() * MILLISECONDS_TO_YEARS) + " years old!");
				System.out.println("Goodbye!");
				inputScanner.close();
		}
		

}
