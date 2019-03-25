public class Problem_004 {
	public static void main(String [] args) {
		long start = System.currentTimeMillis(); 
		int m = 0;

		int a = 999; 
		while (a>=100) {
			int b = 999; 
			while (b>=100) {
				if (a*b <= m)
					break; 
				if (isEq(a*b))
					m = a*b; 
				b--;  
			}
			a--; 
		}
		
		long stop = System.currentTimeMillis(); 
		System.out.println(m);
		System.out.println(stop - start + " ms");
	}
	
	public static boolean isEq(int n) {
		String s = String.valueOf(n);
		String r = ""; 
		boolean b = false; 
		for (int i=s.length()-1; i>=0; i--) {
			r = r + s.substring(i,i+1);
		}
		if (s.equals(r))
				b = true; 
		return b; 
	}
}
