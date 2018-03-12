/*
What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */

public class Problem_017 {
   public static void main(String[] args) {
		int n = 1001, p = 1; 
		for (int i=3; i<=n; i+=2) {
			p += 4*(i*i)-6*i + 6; 
		}
		System.out.println("Answer: " + p);
	}
}
