/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 */
import java.io.*; 

public class Problem_010 {

	public static void main(String[] args) {
		System.out.println(isCount(10));
	}
	
	public static long isCount(int count) {
		int num = 0;
		long j = 0;
		for (int i=2; i<2000000; i++) {
			if (isPrime(i))
				j+= i;  
//			if (j==count)
//				return j;
		}
		return j;
				}
	
	public static boolean isPrime(double num){
		if(num < 2)
			return false;
		for(int i = 2; i <= Math.sqrt(num); i++)
			if(num % i == 0)
				return false;
		return true;
	}
}