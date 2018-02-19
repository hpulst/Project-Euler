/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
 */


import java.util.*;

public class Problem_017 {
   public static void main(String[] args) {

      String s = "Hello World! 3 + 3.0 = 6 ";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      while (scanner.hasNext()) {
         
         // check if the scanner's next token is an int
         System.out.println("" + scanner.hasNextInt());

         // print what is scanned
         System.out.println("" + scanner.next());
      }

      // close the scanner
      scanner.close();
   }
}