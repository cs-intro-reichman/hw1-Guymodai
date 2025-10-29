import java.util.Scanner;
public class NumWords {
	public static void main(String args[]) {
	   Scanner reader = new Scanner(System.in);
	   System.out.println("please enter number");
	   int number = reader.nextInt();
	   System.out.println("% java NumWords " + number);
	   System.out.println((number/100)%10  +" hundreds, "+ (number/10)%10 + " tens, and " +number%10 +" ones.");
	}
}
