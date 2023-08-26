package coderbyte;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
	
	 private ArrayList<Trade> trades = new ArrayList<>();
	    private double USDINRRate = 66.00;
	    private Scanner sc = new Scanner(System.in);

	    public void book() {
	        System.out.print("Enter customer Name: ");
	        String customerName = sc.next();

	        System.out.print("Enter Currency Pair: ");
	        String currencyPair = sc.next();

	        if (!currencyPair.equalsIgnoreCase("USDINR")) {
	            System.out.println("Invalid currency pair. Only USDINR is supported.");
	            return;
	        }

	        System.out.print("Enter amount to transfer: ");
	        double amount = sc.nextDouble();

	        System.out.print("Do you want to get Rate (Yes/No): ");
	        String getRate = sc.next();

	        double rate = USDINRRate;
	        if (getRate.equalsIgnoreCase("Yes")) {
	            rate = USDINRRate;
	        }

	        double inrAmount = amount * rate;
	        DecimalFormat decimalFormat = new DecimalFormat("#,##,###.00");

	        System.out.println("You are transferring INR " + decimalFormat.format(inrAmount) + " to " + customerName +
	                " (Assuming that rate was " + rate + ")");

	        System.out.print("Book/Cancel this trade? (Book/Cancel): ");
	        String tradeAction = sc.next();

	        if (tradeAction.equalsIgnoreCase("Book")) {
	            Trade trade = new Trade(currencyPair, customerName, inrAmount, rate);
	            trades.add(trade);
	            System.out.println("Trade for " + currencyPair + " has been booked with rate " + rate +
	                    ", The amount of Rs " + decimalFormat.format(inrAmount)
	                    + " will be transferred in 2 working days to " + customerName + ".");
	        } else if (tradeAction.equalsIgnoreCase("Cancel")) {
	            System.out.println("Trade is Canceled.");
	        }
	    }

	    public void print() {
	        System.out.println("TradeNo\t\tCurrencyPair\tCustomerName\tAmount\t\tRate");
	        for (Trade trade : trades) {
	            System.out
	                    .println(trade.getTradeNo() + "\t\t" + trade.getCurrencyPair() + "\t\t" + trade.getCustomerName() +
	                            "\t\tINR" + trade.getAmount() + "\t" + trade.getRate());
	        }
	    }

	    public void exit() {
	        System.out.print("Do you really want to exit (y/n): ");
	        String confirmExit = sc.next();
	        if (confirmExit.equalsIgnoreCase("Y")) {
	            System.out.println("Bye - have a good day");
	            sc.close();
	            System.exit(0);
	        }
	    }
	}

	
	
	


