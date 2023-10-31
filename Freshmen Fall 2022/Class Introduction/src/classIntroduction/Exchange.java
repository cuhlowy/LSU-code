package classIntroduction;


public class Exchange {
	public static void main(String[] args) {
		
		double total;
		double totalValue;
		
		Currency dollar = new Currency("Dollar", 27, Currency.DOLLARS_TO_CREDITS);
		Currency bleghthers = new Currency("Bleghthers", 2931, Currency.BLEGHTHERS_TO_CREDITS);
		Currency smorgos = new Currency("Smorgos", 3, Currency.SMORGOS_TO_CREDITS);
		
		
		System.out.printf("%f %s are worth %f\n",smorgos.getAmount(), smorgos.getCurrency_Name(), smorgos.getCredit());
		System.out.println(bleghthers.getCurrency_Name());
		System.out.printf("With %f %s, you can buy %f %s\n", dollar.getAmount(), dollar.getCurrency_Name(), dollar.checkExchange(smorgos), smorgos.getCurrency_Name()); 
		System.out.printf("With %f %s, you can buy %f %s\n", bleghthers.getAmount(), bleghthers.getCurrency_Name(), bleghthers.checkExchange(dollar), dollar.getCurrency_Name());
		
		total = dollar.getCredit() + smorgos.getCredit() + bleghthers.getCredit();
		System.out.printf("%f %s, %f %s, %f %s are worth: %f Credits\n", dollar.getAmount(), dollar.getCurrency_Name(), bleghthers.getAmount(), bleghthers.getCurrency_Name(), smorgos.getAmount(), smorgos.getCurrency_Name(), total);
		
		totalValue = dollar.getAmount() + smorgos.checkExchange(dollar) + bleghthers.checkExchange(dollar);
		System.out.printf("If we converted everything to dollars, we would have %f %s\n", totalValue, dollar.getCurrency_Name());

}
	}

