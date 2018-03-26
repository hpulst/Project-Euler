/*
What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

public class Problem_028 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		
		int n = 1001, p = 1; 
		for (int i=3; i<=n; i+=2) {
			p += 4*(i*i)-6*i + 6; 
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println("Answer: " + p);
		System.out.println(stop - start + " ms");
	}
}
