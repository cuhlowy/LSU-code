//Student Name: Chloe Chin
//LSU ID: 894023599

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
		
	ArrayList<Cake> cakeArray = new ArrayList<>(); 
		
	

	 void listInventory() {

		 Collections.sort(cakeArray);
		
		 for(Cake c:cakeArray)
			  c.printCard();
				
	}

	 void addCake(Cake cake) {
		cakeArray.add(cake);
	}
	
	

}
