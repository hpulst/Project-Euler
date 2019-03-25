public class Problem_006 {
	private static int n = 100; 
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		long square = 0, sum = 0; 
		
		for (int i=1; i<=n; i++) {
				sum += i*i; 
				square += i; 
			}
		square = square * square;  
		
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + sum );
		System.out.println("sum: " + square );
		System.out.println("sum: " + (square - sum));
		System.out.println(stop - start + " ms");
	}
}
