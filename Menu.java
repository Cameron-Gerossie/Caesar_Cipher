import java.util.Scanner;

class Menu /* Displays a message to the user and allows them to make choices about what parts of the program run. */
{
   
   public static void sign() // Displays the WELCOME at the beginning of the program, may look a little strange in pdf.
   {
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("@  @@@@@@@@@@@@@@@@@  @@          @@  @@@@@@@@@@@@@       @@@@@       @@@@@@    @@@    @@@@          @");
      System.out.println("@  @@@@@@@   @@@@@@@  @@  @@@@@@@@@@  @@@@@@@@@@@  @@@@@@@@@@  @@@@@@  @@@@  @@  @  @@  @@@  @@@@@@@@@");
      System.out.println("@@  @@@@@  @  @@@@@  @@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@  @@  @@@@   @@@@  @@  @@@@@@@@@");
      System.out.println("@@  @@@@@  @  @@@@@  @@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@  @@  @@@@   @@@@  @@  @@@@@@@@@");
      System.out.println("@@@  @@@  @@@  @@@  @@@@        @@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@  @@  @@@@   @@@@  @@        @@@");
      System.out.println("@@@  @@@  @@@  @@@  @@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@  @@  @@@@@@@@@@@  @@  @@@@@@@@@");
      System.out.println("@@@@  @  @@@@@  @  @@@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@@@  @@@@@@@@  @@  @@@@@@@@@@@  @@  @@@@@@@@@");
      System.out.println("@@@@  @  @@@@@  @  @@@@@  @@@@@@@@@@  @@@@@@@@@@@  @@@@@@@@@@  @@@@@@  @@@  @@@@@@@@@@@  @@  @@@@@@@@@");
      System.out.println("@@@@@   @@@@@@@   @@@@@@          @@          @@@@        @@@@        @@@@  @@@@@@@@@@@  @@          @");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("");
      System.out.println("To Cameron Gerossie's Encryption Program.");
   }
   
   public static void menu() // Displays the menu to the user
   {
      System.out.println();
      
      System.out.println("Please select one of the following. (Enter 1-4)");
      System.out.println("1. Encrypt Message");
      System.out.println("2. Decrypt Message");
      System.out.println("3. Brute Force");
      System.out.println("4. Exit");
      System.out.println();
      
   }
   
   public static int choice() // Uses a scanner to allow the user to decide what menu option they want.
   {
      int choice;
      
      Scanner input = new Scanner(System.in); // User choice Scanner
      
      System.out.print("--> ");
      choice = input.nextInt(); // Prompts the user for an input.
      
      switch(choice)
      {
         case 1: Cipher.phrase(); Key.setKey(); Cipher.encrypt(); break; // Encrypt option
         case 2: Cipher.phrase(); Key.setKey(); Cipher.decrypt(); break; // Decrypt option
         case 3: Cipher.phrase(); Cipher.bruteForce(); break;            // Brute Force option
         case 4: break;                                                  // Exit option
      }
      
      return choice; // Sends the value of choice back to the Menu.choice call in the run method.
   }
   
   public static int cont() // Displays the continue prompt and takes users input
   {
      int choice;
      
      Scanner input = new Scanner(System.in); // User choice Scanner
      
      System.out.println("\nWould you like to continue? (1 = yes/0 = no)");
      
      System.out.print("--> ");
      choice = input.nextInt(); // Prompts the user for an input.
      
      switch(choice)
      {
         case 0: choice = 4; break; // Sets choice equal to 4 because that is the value that breaks the while loop in the run method
         case 1: break;
      }
      
      return choice; // Sends the value of choice back to the Menu.cont call in the run method
   }
   
}
