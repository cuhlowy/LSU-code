package grandmasPrinter;

public class GrandmasPrinter {
	public static void main(String[] args) {
		final double VOLUME_OF_MOON = 21958000000.0; // In Km^3
		final double VOLUME_OF_PURSE = 0.00038861; // m^3
		final double SHRINK_RAY_CONVERSION_RATIO = 364.37;
		
		double energy_needed_for_shrink_ray = (Math.pow(VOLUME_OF_MOON,0.5))/ (SHRINK_RAY_CONVERSION_RATIO * VOLUME_OF_PURSE);
		//PRINT 1 HERE
			System.out.printf ("The volume of the moon %e. The volume of the purse is %f. The energy cost is %.0f." ,VOLUME_OF_MOON, VOLUME_OF_PURSE, energy_needed_for_shrink_ray);
			
		
		
		final double SELL_VALUE_OF_MOON = 324154.23; // in USD
		final double COST_PER_ENERGY = 0.252; // USD/kW
		final double G_CUT_OF_PROFIT = 0.31415; // Don't worry who G is sweety
		final double G_FEE_SENIOR_DISCOUNT = 40000; 
		
		double energy_cost = energy_needed_for_shrink_ray * COST_PER_ENERGY;
		double profit = (SELL_VALUE_OF_MOON - (energy_cost));
		double grannys_profit = profit - ((profit * G_CUT_OF_PROFIT) + G_FEE_SENIOR_DISCOUNT);
		double Gs_profit = (profit * G_CUT_OF_PROFIT) + G_FEE_SENIOR_DISCOUNT;
		//PRINT 2 HERE
			System.out.printf("\nEnergy cost:\t\t+%10.2f$\nProfit:\t\t\t+%10.2f$\nGrandma's profit:\t+%(10.2f$\nG's profit:\t\t+%10.2f$\n" ,energy_cost, profit, grannys_profit, Gs_profit);
		
		//Answer Print 3 in a comment here
			//Grandma earns a smaller profit. Now she is making 1449.95$ when she made 6316.72$ before the purse change.
			
	}

}

