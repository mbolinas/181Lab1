package pkgMain;


/*
 * CISC181 Lab1
 * 
 */

import java.math.*;
import java.util.Scanner;

public class Default {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How long will you be working?");
		int yearsWorking = scan.nextInt();
		
		System.out.println("What's your annual compound interest?");
		double annualWorking = scan.nextDouble();
		
		System.out.println("How long will you be retired?");
		int yearsRetired = scan.nextInt();
		
		System.out.println("What's your annual compound interest when retired?");
		double annualRetired = scan.nextDouble();
		
		System.out.println("How much monthly income will you need when retired?");
		double incomeRequired = scan.nextDouble();
		
		System.out.println("What's your monthly SSI?");
		double monthlySSI = scan.nextDouble();
		
		scan.close();
		
		
		
		
		double expensesMonthly = incomeRequired - monthlySSI;
		double savings = 0;
		
		savings = expensesMonthly * ((1 - Math.pow((1 + (annualRetired / 12)), -1 * 12 * yearsRetired)) / (annualRetired / 12));
		
		savings = Math.round(savings * 100);
		savings = savings / 100;
		
		System.out.println("Total savings needed: $" + savings);
		
		double monthlyDeposit = savings / ((Math.pow(1 + (annualWorking / 12), 12 * yearsWorking) - 1) / (annualWorking / 12));
		
		monthlyDeposit = Math.round(monthlyDeposit * 100);
		monthlyDeposit = monthlyDeposit / 100;
		
		System.out.println("Monthly deposit needed: $" + monthlyDeposit);
		
		
		
	}
}