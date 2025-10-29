import java.util.Scanner;
public class Ascend {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int small, medium, large;
		System.out.println("Please enter the minimum range for the shuffle:");
		int min = reader.nextInt();
		System.out.println("Please enter the maximum range for the shuffle:");
		int max = reader.nextInt();
		int range = max - min + 1;
		small = (int)(Math.random() * range) + min;
		medium = (int)(Math.random() * range) + min;
		large = (int)(Math.random() * range) + min;
		System.out.println("% java Ascend 100 ");
		System.out.println( small + " " + medium + " " + large);
		int smallest = Math.min(small, Math.min(medium, large));
		int largest = Math.max(small, Math.max(medium, large));
		int middle = small + medium + large - smallest - largest;
		System.out.println(smallest + " " + middle + " " + largest);
	}
}
