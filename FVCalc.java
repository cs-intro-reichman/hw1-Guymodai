import java.util.Scanner;
public class FVCalc {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int investedAmount,years;
		double annualRate;
		System.out.println("Please enter the amount of money you want to invest:");
		investedAmount = reader.nextInt();
		System.out.println("Please enter the annual interest rate:");
		annualRate = reader.nextDouble() / 100.0;
		System.out.println("Please enter the number of years you want to invest for:");
		years = reader.nextInt();
		double futureValue = investedAmount * Math.pow(1 + annualRate, years);
		System.out.println("After " + years + " years, $" + investedAmount + " saved at " + (annualRate * 100) + " will yield " + (int)futureValue);
	}
}
