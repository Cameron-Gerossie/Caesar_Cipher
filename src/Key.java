import java.util.Scanner;

class Key /* Stores the user entered key */
{
   static private int keyInt;
   
   public static int getKey() // Allows the key to be called from other classes
   {
      return keyInt; // Sends the value of keyInt to where it's called
   }
   
   public static void setKey() // Allows the user to enter the key
   {
      int kI;
      
      Scanner keyInput = new Scanner(System.in); // Key Scanner
      
      System.out.println("\nEnter your key:");
      System.out.print("--> ");
      kI = keyInput.nextInt(); // Prompts the user to enter a key.
      
      while(kI > 26) // If the key is greater than 26 it’s the same as that key - 26.
         kI-=26;
      
      System.out.println("\tKey: " + kI);
      
      keyInt = kI; // Sets the value of keyInt to the user entered key.
      
   }
}
