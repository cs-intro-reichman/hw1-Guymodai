import java.util.Scanner;
public class TimeFormat {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("please enter the time in hh:mm format");
		args = new String[1];
		args[0] = reader.nextLine();
		System.out.println("% TimeFormat " + args[0]);
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if(hours < 12)
		{
			if( minutes>10)
			{
				System.out.println(hours + ":" + minutes +" AM");
			}
			else
			{
				System.out.println(hours + ":0" + minutes +" AM");
			}
			
		}
		else
		{
			if( minutes>10)
			{
				System.out.println(hours + ":" + minutes +" PM");
			}
			else
			{
				System.out.println(hours + ":0" + minutes +" PM");
			}
			
		}
	}
}

