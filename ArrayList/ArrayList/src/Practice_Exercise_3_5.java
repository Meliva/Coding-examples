import java.util.*;

public class Practice_Exercise_3_5 
{
	public static final int NUMBERS =6;
	public static final int MAX_NUMBER = 40;
	public static final int PRIZE = 100;
	public static void main(String[] args) 
	{
		Set<Integer> win = createWinningNumbers();
		Set<Integer> ticket = createWinningTicket();
		double prize =0;
		System.out.println();
		Set <Integer> Match = new TreeSet<Integer>(ticket);
		Match.retainAll(win);
		System.out.println("Your ticket was" + ticket);
		System.out.println("Your winning number was: " +win);
		if(Match.size()>0)
		{
			prize = 100 * Math.pow(2, Match.size());
			System.out.println("Matched numbers:" +Match);
			System.out.printf("Your prize is $%.2f\n" ,prize);
		}
	}
	public static Set<Integer>createWinningNumbers()
	{
		Set<Integer> win = new TreeSet<Integer>();
		int number = 0;
		Random r = new Random();
		while(win.size()< NUMBERS)
		{
			number = r.nextInt(MAX_NUMBER) +1;
			win.add(number);
		}
		return win;
	}
	public static Set<Integer>createWinningTicket()
	{
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int number = 0;
	System.out.print("Type " +NUMBERS+ " lotto numbers, the more you match the more you get: ");
		while(ticket.size()<NUMBERS)
		{
			number = scan.nextInt();
			ticket.add(number);
		}
		return ticket;
	}
}
