/*
A palindromic number reads the same both ways. The largest palindrome made 
from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;

public class Problem_004 {

   public static void main(String args[]){
	  System.out.println("Start");
      System.out.println(isMax());
 
   }
   
   public static boolean isPalindrome(int value) {
	   String original = String.valueOf(value);
	   String reverse = ""; 
	   int length = original.length();
	     
	   for ( int i = length - 1; i >= 0; i-- )
		   reverse = reverse + original.charAt(i);
	 
	   if (original.equals(reverse))
		   return true; 
	   else 
		   return false; 
   }
   
   public static int isMax() {
	   int a,b,prod,max = 0; 
	   for (int i=0; i<=999; i++) {
		   for (int j=0; j<=999; j++) {
			   if(isPalindrome(i*j))
				   if(i*j>max)
					   max = i*j;
		   }
	   }
	   return max; 
   }
}

/*    int l=0;
    for (int n1=999;n1>=100;n1--)
      for (int n2=999;n2>=100 && n1*n2>l;n2--)
        if (String.valueOf(n1*n2).equals(new StringBuffer(String.valueOf(n1*n2)).reverse().toString()))
          l=n1*n2;
    System.out.println(l);
*/