/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */

public class Problem_007 {

	public static void main(String[] args) {
		System.out.println(isCount(10001));
	}
	
	public static int isCount(int count) {
		int num = 0;
		int j = 0;
		for (int i=2; i<=9999999; i++) {
			if (isPrime(i))
				j++; 
			if (j==count)
				return i;
		}
		return -1;
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
