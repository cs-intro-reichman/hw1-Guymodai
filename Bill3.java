public class Bill3 {
    public static void main(String[] args) {
        int totalBill = Integer.parseInt(args[3]);
        double payEach = Math.ceil(totalBill / 3.0);
       System.out.println("Dear " + args[2] + ", " + args[1] + ", and " + args[0] + ": pay " + payEach + " Shekels each");
    }
}
