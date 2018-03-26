/*
2520 is the smallest number that can be divided,
by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible 
by all of the numbers from 1 to 20?
*/
package saveDalagan;

public class Problem_005 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 

		boolean b = false;
		int i = 2520; 
		while(!b) {
			i++; 
			
			if (i%20 == 0) {
				int a = 19;
				b = true; 
				while (b && a>1) {
					if(i%a==0)
						b = true; 
					else 
						b = false; 
					a--;
				}
			}
		}
	
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + i );
		System.out.println(stop - start + " ms");
	}
}
