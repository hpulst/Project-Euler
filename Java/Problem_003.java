public class Problem_003 {
	public static void main(String[] args){
		long begin = System.currentTimeMillis();
		
		long n=600851475143L;
		for (long i = 2; i <= n; i++){
			if (n % i==0){
				System.out.println(i);
				n = n / i;
				i = 1;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
	}
}
