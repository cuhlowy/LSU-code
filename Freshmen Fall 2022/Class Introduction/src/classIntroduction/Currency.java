package classIntroduction;

/*

Currency - – The constructor for the Currency Class.
@param - currency_Name - represents the name of the currency (Dollar,
Smorgos, bleghthers, etc.)
@param - exchange_Rate - represents the value of local currency to
credits 
@param amount - The amount of local currency

getCurrency_Name – gets the currency’s name
@return – currency name

getExchange_Rate – gets the exchange rate for a currency
@return – exchange rate of each currency 

GetAmount & SetAmount – a getter and setter for local
currency amount
@return both returns amounts

GetCreditValue – gets credit value
@returns the TOTAL credit value of the currency

CheckExchange – Takes another Currency object and outputs how much the original currency can buy of the other currency
@returns how much of the other currency the current currency can buy. 

*/

public class Currency {

	private String Currency_Name;
    private double Exchange_Rate;
    private double Amount;


    static final double DOLLARS_TO_CREDITS = 53.4;
    static final double BLEGHTHERS_TO_CREDITS = 2.3;
    static final double SMORGOS_TO_CREDITS = 1276.32;

    public Currency(String currency_Name, double amount, double exchange_Rate) {
        super();
        Currency_Name = currency_Name;
        Exchange_Rate = exchange_Rate;
        Amount = amount;
    }

    public String getCurrency_Name() {
        return Currency_Name;
    }
    
    public double getExchange_Rate() {
        return Exchange_Rate;
    }
    public double getCredit() {
        return Amount * Exchange_Rate ;
    }
    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }
    
    public double checkExchange(Currency otherExchangeRate) {
    	double value = this.Exchange_Rate * Amount;
    	return value / otherExchangeRate.Exchange_Rate;
    }
    

}
	
	
	
	
	