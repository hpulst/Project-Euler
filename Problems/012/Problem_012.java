public class Problem_012 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		int sum = 1, t = 1;
		
		int  count = 0; 
		while (count<=500) {
			count = 0;
			for (int j = 1; j<=Math.sqrt(sum); j++) {
				if(sum%j==0) {
					count += 2;
				}
			}
			t++;
			sum += t;
		}
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + (sum-t) + "  count: " + count + " t: " +  t);
		System.out.println(stop - start + " ms");
	}
}
