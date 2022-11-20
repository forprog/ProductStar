package Part_09;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		
		PriceForTaxes[] prices = new PriceForTaxes[10];
		
		Scanner keyboard = new Scanner(System.in);
		int curIteration = 0;
		
		while (true) {
			System.out.println("Input price (\"q\" to quit): ");
			String curInput = keyboard.next();
			if (!curInput.equals("q")) {
				if (PriceForTaxes.checkInputPrice(curInput)) {
					prices[curIteration] = new PriceForTaxes(Double.parseDouble(curInput));
					System.out.println(prices[curIteration].toString());
					curIteration++;
					if (curIteration == 10) break;
					
				} else {
					System.out.println("Bad price");
				}
			}
			else break;
		}
		
		System.out.println();
		System.out.println("All taxes:");
		for (int i = 0; i < curIteration; i++) {
			System.out.println(prices[i].toString());
		}
		
		keyboard.close();

	}
	

	
}
