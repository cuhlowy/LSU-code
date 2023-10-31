package pizza;

public class PizzaDriver {
	
		public static void main(String[] args) {

			
			Pizza pepper = new Pizza(Pizza.PizzaSize.medium);
			pepper.addToppings("Pepperoni");
			pepper.Slice(8);
			pepper.setPizza_name("Pepperoni");
			System.out.printf("[*]A medium %s pizza with %s as toppings will cost %.2f. Comes with %d slices\n", pepper.getPizza_name(), pepper.GetToppings(),pepper.getPrice(0), pepper.getNum_slices());
			
			
			Pizza huttin = new Pizza(Pizza.PizzaSize.hut,12);
			huttin.addToppings("Pepperoni");
			huttin.addToppings("Green Pepper");
			huttin.addToppings("Mushroom");
			huttin.addToppings("Salami");
			huttin.setPizza_name("The Out Hutter");
			if(huttin.addToppings("Papa's Secret Sauce")) {
				System.out.println("[!]Uh oh papa added his secret sauce! (He shouldn't)");
			}
			
			if(huttin.Slice(6)) {
				System.out.println("[!]Uh oh you can unslice a pizza!");
			}
			
			System.out.printf("[*]A Hut-sized %s pizza with %s as toppings will cost %.2f. Comes with %d slices\n", huttin.getPizza_name(), huttin.GetToppings(), huttin.getPrice(0), huttin.getNum_slices());

			
		}

	}


