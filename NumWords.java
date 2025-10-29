
public class NumWords {
	public static void main(String args[]) {
	   int number = (int)(Math.random() * 1000) + 1;;
	   System.out.println("% java NumWords " + number);
	   System.out.println((number/100)%10  +" hundreds, "+ (number/10)%10 + " tens, and " +number%10 +" ones.");
	}
}
