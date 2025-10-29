public class Ascend {
	public static void main(String[] args) {
		int small, medium, large;
		int min =1,max = 100 ;
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
