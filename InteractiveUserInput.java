import java.util.Scanner

/**
 * A Java programmer to take user Inputs Interactively
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
		 
		 String output = format("%s is the name of the book");
		 
		 System.out.println("output");
		 }
		 
	}
		 
		 