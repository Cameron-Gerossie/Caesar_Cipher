import java.util.Scanner;

class Cipher /* Contains all methods that allow the phrase to be encrypted/decrypted */
{
   static private String phrase;
   
   public static void encrypt() // Encrypts the user entered phrase
   {  
      shift(Key.getKey()); // Runs the shift with the entered key
      Run.display(phrase, 1); // Displays the encrypted phrase
   }
   
   public static void decrypt() // Decrypts the user entered phrase
   {
      shift(-(Key.getKey())); // Runs the shift with the entered key
      Run.display(phrase, 2);  // Displays the decrypted phrase
   }
   
   public static void bruteForce() // User enters an encrypted phrase and displays all possibilities of decryptions
   {
      String temp = phrase;
      
      System.out.println("\nPossible outcomes:");
      
      for(int n=-1; n>-26; n--) // Runs through and prints all possible decryptions
      {
         shift(n);
         System.out.printf("%2d: ", (-n)); // Displays the number of the key
         Run.display(phrase, 3); // Displays the possible outcomes
         phrase = temp; // Makes sure that the user is decrypting the original phrase entered
      }
   }
   
   public static String shift(int key) // Method that shifts the phrase(encrypt or decrypt)
   {
      char p[] = new char[phrase.length()];
      //int count=0;
      
      for(int n=0; n<phrase.length(); n++) // Fills array with individual characters of the phrase
      {
         p[n] = phrase.charAt(n); // Sets each value in the array to a character from the phrase
      }
      
      phrase = ""; // Makes sure original phrase is not saved.
      
      for(int i=0; i<p.length; i++) // Shifts characters by the entered key
      {
         if(p[i] >= 97 && p[i] <= 122) // Makes sure only the a-z characters are affected by the shift not symbols, spaces, etc.
         {
            p[i] = (char)(p[i] + key); // Shifts the characters by the user entered key.

            if((int)(p[i]) > 122) // Makes sure characters stay as a-z
               p[i] = (char)(p[i] - 26); // Subtracts 26 to make it the right value (a-z)
            else if((int)(p[i]) < 97) // Makes sure characters stay as a-z
               p[i] = (char)(p[i] + 26); // Adds 26 to make it the right value (a-z)
         }
      }
      
      for(char conv: p) // Combines the shifted characters into one string
      {
         phrase = phrase + conv; // Adds the characters to the phrase string
         //count++; // Keeps track of what character the array is looking at.
      }
      
      return phrase; // Returns the phrase variable to the encrypt method
   }
   
   public static void phrase() // Allows the user to enter the phrase
   {
      Scanner input = new Scanner(System.in); // Phrase Scanner
      
      System.out.println("\nPlease enter a phrase.");
      System.out.print("--> ");
      phrase = input.nextLine(); // Prompt the user to enter a phrase
      
      phrase = phrase.toLowerCase(); // Sets all characters in the string to lower cases.
   }
   
}
