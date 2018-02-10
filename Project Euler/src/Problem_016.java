/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
 */

import java.math.BigInteger;



public class Problem_016 {
	
	public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        BigInteger a = two.pow(1000);
        String as = a.toString();
        int out = 0;
        for (int i = 0; i < as.length(); ++i) {
            char c = as.charAt(i);
            out += (c-'0');
        }
        System.out.println(out);
    }
}