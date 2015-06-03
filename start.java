import java.util.*;

public class start extends weatherill
{

	Scanner keyboard = new Scanner (System.in);
	public void startGame()
	{
		System.out.println("Hi, enter your name");


		String name = keyboard.nextLine();
		Stat guy = new Stat(name);
	}





}
