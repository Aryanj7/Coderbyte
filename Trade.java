package coderbyte;

public class Trade {

	    private int tradeNo;
	    private String currencyPair;
	    private String customerName;
	    private double amount;
	    private double rate;

	    public Trade(String currencyPair, String customerName, double amount, double rate) {
	        this.tradeNo = 0;
	        this.currencyPair = currencyPair;
	        this.customerName = customerName;
	        this.amount = amount;
	        this.rate = rate;
	    }

	    public int getTradeNo() {
	        return tradeNo;
	    }

	    public String getCurrencyPair() {
	        return currencyPair;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public double getRate() {
	        return rate;
	    }
	}


