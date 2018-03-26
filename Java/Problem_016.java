/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
 */

import java.math.BigInteger;

public class Problem_016 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		int sum = 0;
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000); 
		
		for (int i=0; i<n.toString().length(); i++) {
			char c = n.toString().charAt(i);
			sum += (c-'0');  
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + sum);
		System.out.println(stop - start + " ms");
	}
}
