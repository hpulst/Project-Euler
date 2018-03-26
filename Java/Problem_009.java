/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

import java.util.*;

public class Problem_009{
	public static void main(String[] args) {
		int sum = 1000; 
		for(int i=1; i<sum; i++) {
			for(int j=1; j<sum; j++) {
				for(int k=1; k<sum; k++) {
					if(isTriplet(i,j,k,sum))
						System.out.println("Answer: " + i*j*k);

				}
			}
		}
	}

	public static boolean isTriplet(int a, int b, int c, int sum) {
		if(a*a+b*b==c*c && a+b+c==sum && a<b && b<c)
			return true;
		else 
			return false; 
	}

}

