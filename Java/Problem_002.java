public class Problem_002 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		long sum = 0; 
		long n = 0; 
		
		int i = 1; 
		while(n < 4000000) {
			if (n%2==0)
				sum += n; 
			n = fib(i);
			i++; 
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println(sum);
		System.out.println(stop - start + "ms");
	}
	
	public static long fib(int n) {
		if(n<=2)
			return 1; 
		
		return fib(n-1) + fib(n-2); 
	}
}
