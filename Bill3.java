public class Bill3 {
	public static void main(String[] args) {
       	String[] names = new String[3];
       	names[0] = "Ron";
        names[1] = "Lisa";
        names[2] = "Dan";
        int totalBill = 100;
        double payEach = Math.ceil(totalBill/3.0);
        System.out.println("Dear " + names[2] + " ," + names[1] + ",and " + names[0] + ": pay " + payEach + " Shekels each.");
    }
}
