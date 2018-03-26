public class Problem_001 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		int sum = 0; 
		
		for (int i=1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum += i; 
			}
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + sum );
		System.out.println(stop - start + " ms");
	}
}
