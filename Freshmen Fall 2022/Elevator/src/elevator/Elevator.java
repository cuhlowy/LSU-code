package elevator;

import java.util.Scanner;
public class Elevator {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int floor = 0;
		System.out.println("Enter what floor you would like to go to:");
		
		String button = inputScanner.next();
	
	if (button.equals ("G")) {
		System.out.println("Button G was pressed, controller go to floor 0.");
	}
	
	else if (button.contains ("B")) {
		button = button.substring(1);
		System.out.println("Go to floor -" + button + ".");
	}
	else {
		floor = Integer.parseInt(button);
		//System.out.println("Button " + floor + " was pressed, controller go to floor " + floor);
	}
	if (floor == 13) {
		floor = Integer.parseInt(button);
		System.out.println("Floor 13 does not exist.");
	}
	if (floor <= 12) {
		System.out.println("Button " + floor + " was pressed, controller go to floor " + floor);
	}
	else if (floor > 13) {
		floor = floor - 1;
		System.out.println("Button " + button + " was pressed, controller go to floor " + floor);
	}
}
}
