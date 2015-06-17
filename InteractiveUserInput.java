import java.util.Scanner;



/**
 * A Java programmer to take user Inputs Interactively
 *
 * @author SmallMan90
 *
 */
 
 public class InteractiveUserInput
   {
      public static void main (String[] args)
	   {
	     // Instantiating the Scanner class to read the command line input
		 Scanner input = new Scanner(System.in);
		 
		 //Prompt to user for the Book name
		 System.out.print("Enter Book name: ");
		 
		 //get the input provided by the user
		 String BookName = input.nextLine();
		 
		 String output = String.format("%s is the name of the book", BookName);
		 
		 System.out.println(output);
		 }
		 
	}
		 
		 