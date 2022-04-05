import java.util.*;
public class ArrayMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String[][] array = 
		{
			{"Water","Tea","Coffee"}, {"Hot", "Cold"}
		};
		
		//Decision to Order
		System.out.println("PLEASE ANSWER WITH THE NUMBER ON THE LEFT!");
		System.out.println("------------------------------------------");
		System.out.println("How Would You Like To Order Your Drink?");
		System.out.println("(1) Choosing");
		System.out.println("(2) Randomizing");
		int selectionType = scanner.nextInt();
		int ticketNumber = random.nextInt(999)+1;
		
		//Random Selection
		if(selectionType==2)
		{
			int randTemp = random.nextInt(2);
			int randDrink = random.nextInt(3);
			System.out.println("------------------------------------------");
			System.out.println("Randomizer Has Chosen '" +array[1][randTemp]+" "+array[0][randDrink]+"'!");
			System.out.println("Would You Like To Proceed?");
			System.out.println("(1) Yes");
			System.out.println("(2) No");
			int randCorrection = scanner.nextInt();
			if(randCorrection==1)
			{
				System.out.println("------------------------------------------");
				System.out.println("You Have Ordered " +array[1][randTemp]+" "+array[0][randDrink]+"!");
				switch(randDrink)
				{
					case 0: System.out.println("Total Cost Will Be $1.00!");
					break;
					case 1: System.out.println("Total Cost Will Be $2.50!");
					break;
					case 2: System.out.println("Total Cost Will Be $3.00!");
					break;
				}
				System.out.println("Your Ticket Number: "+ticketNumber);
			}
			else if(randCorrection==2)
			{
				System.out.println("------------------------------------------");
				System.out.println("Sorry, Restart Your Order.");
			}
			else
			{
				System.out.println("------------------------------------------");
				System.out.println("Confirmation Invalid!");
			}
		}
			
		//Choosing Drink
		else if(selectionType==1)
		{
			System.out.println("------------------------------------------");
			System.out.println("Select A Drink:");
			System.out.println("(1) Water");
			System.out.println("(2) Tea");
			System.out.println("(3) Coffee");
			int chooseDrink = scanner.nextInt()-1;

			if(chooseDrink>2) 
			{
				System.out.println("------------------------------------------");
				System.out.println("That Wasn't An Option! Try Again!");
			}
			else 
			{
				System.out.println("------------------------------------------");
				System.out.println("Select Temperature:");
				System.out.println("(1) Hot");
				System.out.println("(2) Cold");
			int chooseTemp = scanner.nextInt()-1;
			
			//Choosing Temperature
			if (chooseTemp>1)
			{
				System.out.println("------------------------------------------");
				System.out.println("That Wasn't An Option! Try Again!");
			}
				else 
				{
					System.out.println("------------------------------------------");
					System.out.println("Is Your Order Correct?: '" +array[1][chooseTemp]+" "+array[0][chooseDrink]+"'");
					System.out.println("(1) Yes");
					System.out.println("(2) No");
					int chooseCorrection = scanner.nextInt();
					
					if(chooseCorrection==1)
					{
						System.out.println("------------------------------------------");
						System.out.println("You Have Ordered " +array[1][chooseTemp]+" "+array[0][chooseDrink]+"!");
						switch(chooseDrink)
						{
							case 0: System.out.println("Total Cost Will Be $1.00!");
							break;
							case 1: System.out.println("Total Cost Will Be $2.50!");
							break;
							case 2: System.out.println("Total Cost Will Be $3.00!");
							break;
						}
						System.out.println("Your Ticket Number: "+ticketNumber);
					}
						else if(chooseCorrection==2)
						{
							System.out.println("------------------------------------------");
							System.out.println("Sorry, Restart Your Order.");
						}
						else
						{
							System.out.println("------------------------------------------");
							System.out.println("Confirmation Invalid!");
						}
				}
			}
		}
		else 
		{
			System.out.println("------------------------------------------");
			System.out.println("That Wasn't An Option! Try Again!");
		}
	}
}
//Program made 5/12/21
