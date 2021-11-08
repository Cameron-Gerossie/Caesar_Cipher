class Run /* Controls when what methods are called, basically tells the whole program to run. */
{   
   public static void run()
   {     
      int choice = 0;
      
      Menu.sign();
      
      while(choice != 4) // While loop ensures that the program doesn't end before the user wants it to, choice becomes 4 when the user exits the program.
      {
         Menu.menu(); // Calls the menu to be displayed every time the while loop runs
         
         choice = Menu.choice(); // Sets choice to the input of the user.
         
         if(choice < 4) // Displays the choice to continue or not if choice is less than 4
         {
            choice = Menu.cont(); // Sets the choice variable to what the user enters in the continue prompt.
         }
         
      }
      System.out.println(); // Final message that is displayed before the program ends.
      System.out.println("Thank you for using Cameron Gerossie's Encryption Program");
      System.out.println("Have a wonderful day.");
   }
      
   public static void display(String phrase, int choice){   
	   if(choice == 1){
	    System.out.println("Encrypted Phrase: " + phrase);
	   } else if(choice == 2) {
         System.out.println("Decrypted Phrase: " + phrase);
      } else if(choice == 3){
         System.out.println("" + phrase);
      }
   }
}

