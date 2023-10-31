package challenge;
import java.util.Random;
public class Challenge {

		static Random rand = new Random();
		
		public static void main(String[] args) {
			int array[] = {4,2,32,57,22};
			Challenge newArray = new Challenge(array);
			System.out.printf("[*]Your array: \t\t\t\t\t%s\n", newArray.toString());
			newArray.SortLowToHigh();
			System.out.printf("[*]Your array sorted high to low: \t\t%s\n", newArray.toString());
			newArray.SortHighToLow();
			System.out.printf("[*]Your array sorted low to high: \t\t%s\n", newArray.toString());
			newArray.Unsort();
			System.out.printf("[*]Your array unsorted: \t\t\t%s\n", newArray.toString());
			newArray.AddToArray(5);
			newArray.AddToArray(33);
			newArray.AddToArray(100);
			System.out.printf("[*]Your array after adding three numbers: \t%s\n",newArray.toString());
			newArray.SortLowToHigh();
			System.out.printf("[*]Your array sorted low to high: \t\t%s\n", newArray.toString());
		}
	}
