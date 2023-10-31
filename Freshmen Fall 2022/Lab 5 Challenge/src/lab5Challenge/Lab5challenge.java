package lab5Challenge;
	import java.util.Scanner;
	public class Lab5challenge {

	//1. With a 15% probability, C.H.A.D. will take two steps forward.
	//2. With a 35% probability, C.H.A.D. will take one step forward
	//3. With a 25% probability, C.H.A.D. will take one step backwards. (There is infinite space behind C.H.A.D. So, his position may go negative relative to the start)
	//4. With a 15% probability, C.H.A.D. will stumble around in place, not moving.
	//5. With a 10% probability, C.H.A.D. will sway side to side, staying in place but creating a disturbance!
	//6. If C.H.A.D. creates 5 or more disturbances, his RA will have a talk with him in the morning
		
		//use while loop and if then statements 
		public static void main(String[] args) {
			short num_investors = 12;
			int num_years = 0;
			
			while(num_investors < 30000) {
				num_investors *= 2;
				num_years++;
				num_investors += (37281 % num_years);
				
			} 
			num_years++;
			System.out.println("[*]My million dollar fortune will be complete in: " + num_years + " years! In fact I'll have " + num_investors + " investors by then!");
			

			

		}

	}

