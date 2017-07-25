import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assumptions: User is entering only one char
		
		//variables and instantiations
		String choice="y";
		Scanner scan = new Scanner(System.in);
		
		while(!choice.equalsIgnoreCase("n"))
		{
			
			//1. prompt the user
			System.out.print("Would you like to continue? ");
			
			//2. get input from user;
			choice = scan.next();
			
			//3. check for type of input
	
			if(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"))
			{
				//if not y or n, note error and reprompt
				System.out.println("Not valid input.  Try again.");
			}
		}
		
	}

}
