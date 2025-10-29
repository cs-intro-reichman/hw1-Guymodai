import java.util.Scanner;
public class Bill3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
       	String[] names = new String[3];
       	 for(int i=0;i<3;i++)
		 {
            System.out.print("Enter the name of diner " + (i+1) + ": ");
            names[i] = input.nextLine();
        }
        System.out.print("How much do you want to pay? ");
        int totalBill = input.nextInt();
        double payEach = Math.ceil(totalBill/3.0);
        System.out.println("Dear " + names[2] + " ," + names[1] + " ,and " + names[0] + ": pay " + payEach + " Shekels each.");
    }
}
