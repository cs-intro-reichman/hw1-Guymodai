public class FVCalc {
    public static void main(String[] args) {
        int investedAmount = Integer.parseInt(args[0]);
        double annualRate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        double futureValue = investedAmount * Math.pow(1 + (annualRate / 100.0), years);
        System.out.println("After " + years + " years, $" + investedAmount + 
                           " saved at " + annualRate + "% will yield $" + (int)futureValue);
    }
}