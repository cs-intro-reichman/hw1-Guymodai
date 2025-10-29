public class FVCalc {
	public static void main(String[] args){
		int investedAmount = 25000,years = 25;
		double annualRate =0.06;
		double futureValue = investedAmount * Math.pow(1 + annualRate, years);
		System.out.println("After " + years + " years, $" + investedAmount + " saved at " + (annualRate * 100) + " will yield " + (int)futureValue);
	}
}
