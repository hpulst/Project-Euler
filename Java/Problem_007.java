/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */

/*
By listing the first six prime numbers: 
2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

public class Problem_007 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		
		int i = 1;
		int count = 0; 
		while(count<10001) {
			i++;
			if(isPrim(i)) {
				count++;
			}
		}
		long stop = System.currentTimeMillis(); 
		System.out.println(i);
		System.out.println(stop - start + " ms");
	}
	
	public static boolean isPrim(int n) {
		boolean b = true;
		int j = 2; 
		while(j<=Math.sqrt(n)) {
				if(n%j == 0) {
					b = false; 
					break; 
				}
				j++; 
		}
		return b; 
	}
}

