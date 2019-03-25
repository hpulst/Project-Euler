public class Problem_010 {
	private static int l = 2000000; 
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		long sum = 2; 
		
		for (int i=3; i < l; i=i+2) {
			if(isPrim(i))
				sum += i; 
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + sum );
		System.out.println(stop - start + " ms");
	}
	
	public static boolean isPrim(int n) {
		boolean b = true; 
		int i = 2; 
		while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				b = false; 
				break; 
			}
			i++; 
		}
		return b; 
	}
}


