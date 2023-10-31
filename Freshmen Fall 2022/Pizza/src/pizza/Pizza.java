package pizza;
import java.util.ArrayList;
public class Pizza {
	
	/*
	PizzaSize – Makes a pizza of a certain size 
		@param {small, medium, large, hut}
	num_slices – Sets the number of slices of the pizza. 
	addToppings – Adds a topping to a pizza. 
		@param 4
	setPizza_name – Sets the name of the pizza
	getPizzaSize – Returns the size of the pizza
		@return
	getNum_slices() – Returns the number of slices of the pizza
	GetToppings() – Returns the toppings on the pizza
	getPizza_name() – Returns the name of the pizza
	getPrice – Returns the price of the pizza
	*/
	
	static public enum PizzaSize {small, medium, large, hut};
	private PizzaSize pizzasize;
	private int num_slices;
	private String pizza_name;
	private double price;
	private ArrayList <String> pizzaToppings = new ArrayList<String>();
	static int toppingCounter = 0;
	
	static final double small = 8.50;
	static final double medium = 10.25;
	static final double large = 12.75;
	static final double hut = 21.75;
	static double topping = 1.25;
	
	public Pizza(int num_slices, double topping, String pizza_name, double price, PizzaSize pizzasize) {
		super();
		this.num_slices = num_slices;
		this.topping = topping;
		this.pizza_name = pizza_name;
		this.price = price;
		this.pizzasize = pizzasize;
	}
	
	
	
	public Pizza(PizzaSize pizzasize) {
		super();
		this.pizzasize = pizzasize;
	}
	public Pizza(PizzaSize pizzasize, int num_slices) {
		super();
		this.pizzasize = pizzasize;
		this.num_slices = num_slices;
	}



	public PizzaSize getPizzaSize() {
		return pizzasize;
	}
	
	public int getNum_slices() {
		return num_slices;
	}
	
	public boolean Slice(int num_slices) {
		if(this.num_slices <= num_slices) {
			this.num_slices = num_slices;
			return true;
		}
		return false;
	}
	
	
	public ArrayList<String> GetToppings() {
		return pizzaToppings;
	}
	
	public boolean addToppings(String topping) {
		if(pizzaToppings.size() < 4) {
			pizzaToppings.add(topping);
			return true;
		}
		return false;
	}
		
	public String getPizza_name() { 
		return pizza_name;
	}
	
	public void setPizza_name(String pizza_name) { 
		this.pizza_name = pizza_name;
	}
	
	public double getPrice(double price) { 
		switch(pizzasize) {
		case small:
			return (8.50 + (toppingCounter * 1.25));
		case medium:
			return (10.25 + (toppingCounter * 1.25));
		case large:
			return (12.75 + (toppingCounter * 1.25));
		case hut:
			return (21.75 + (toppingCounter * 1.25));
		default:
			return 0;
		}
	}
	
	public void setToppings(double toppings) {
		this.topping = toppings;
		
	}
	
	
}
