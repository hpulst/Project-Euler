import java.util.*;
/*

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.
As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. 
By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. 
However, this upper limit cannot be reduced any further by analysis even though it is known 
that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

 */

public class Problem_024{
	//	static List<Integer> list = new ArrayList<Integer>(); 

	private static final int LIMIT = 28123;  
	private static final List<Integer> list = new ArrayList<>();  
	private static final boolean[] isAbundantSum = new boolean[LIMIT+1];  

	public static void main(String args[]) {
		long start = System.currentTimeMillis(); 
		for (int i=1; i<=LIMIT; i++) {
			if (isAbundant(i)) {
				list.add(i); 
				for (int j : list) {
					if(i+j <= LIMIT) {
						isAbundantSum[i+j] = true; 
					}
				}
			}
		}
		int sum = 0; 
		for (int i=0; i<isAbundantSum.length; i++) {
			if(!isAbundantSum[i]) {
				sum += i; 
			}
		}
		long stop = System.currentTimeMillis(); 
		System.out.println("Sum:  " + sum + "  Time used: " + (stop - start) + "ms");
	}

	private static int d(int number){  
		int sum = 1;  
		int sqrt = (int)Math.sqrt(number);  
		for (int i=2; i<=sqrt; i++){  
			if (number % i == 0){  
				sum += (i + number / i);  
			}  
		}  
		if (sqrt * sqrt == number){  
			sum -= sqrt;  
		}  
		return sum;  
	}  
	private static boolean isAbundant(int number){  
		return d(number) > number;  
	}  
}

