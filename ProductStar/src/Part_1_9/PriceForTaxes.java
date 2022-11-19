package Part_1_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceForTaxes {
	private double price;
	private double tax;
	
	public static boolean checkInputPrice(String input) {
		String PATTERN = "\\d+|\\d+.\\d+";
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(input);
		
		return matcher.matches();
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		calculateTax();
	}
	public double getTax() {
		return tax;
	}
	private void calculateTax() {
		double taxRate = 0;
		if (this.price <= 100) {
			taxRate = 0.1;
		} else if (this.price <= 1000) {
			taxRate = 0.2;
		} else if (this.price <= 10000) {
			taxRate = 0.3;
		}
		this.tax = this.price * taxRate; 
	}	
	public PriceForTaxes(double price) {
		super();
		this.price = price;
		calculateTax();
	}

	@Override
	public String toString() {
		return String.format("price=%.2f, tax=%.2f", price, tax);
	}
	
}
