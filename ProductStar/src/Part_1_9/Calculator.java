package Part_1_9;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
    	double[] results = new double[10];
    	boolean gottaQuit = false;
        Scanner reader = new Scanner(System.in);

        int curIteration = 0;
        
        while (true) {
        	curIteration++;
        	
            System.out.print("¬ведите 2 числа ");

            double first = reader.nextDouble();
            double second = reader.nextDouble();

            System.out.print("¬ведите оператор: (+, -, *, /,q - выход): ");
            char operator = reader.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                case '/':
                    result = first / second;
                    break;
                case 'q':
                	gottaQuit = true;
                	break;
                default:
                    System.out.printf("¬ведите корректный оператор");
                    return;
            }
            
            
            if (gottaQuit) break;

            System.out.printf("%.1f %c %.1f = %.1f\n", first, operator, second, result);
            results[curIteration-1] = result;
            
            if (curIteration == 10) break;
		}
  
        for (int i = 0; i < curIteration; i++) {
        	System.out.println(String.format("Value %d: %.1f", i+1, results[i]));
		}
        
        reader.close();
    }
}