// Program-2
// Java program to find all substrings of a string. For example substrings of “fun” are :- “f”, 
// “fu”, “fun”, “u”, “un” and “n”.
import java.util.Scanner;
 
class SubString
{
   public static void main(String args[])
   {
      String string, sub;
      int i, j, len;
     
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to print all its substrings");
      string  = in.nextLine();
     
      len = string.length();  
   
     
      for (i = 0; i < len; i++)
      {
         for(j = 1; j <= len - i; j++)
         {
            sub = string.substring(i, i+j);
            System.out.println(sub);
         }
      }
   }
}