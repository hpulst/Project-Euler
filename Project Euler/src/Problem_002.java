
public class Problem_002 {
	
	public static void main(String[] args) {
		System.out.println(counter()); 
	}
	
	public static int  counter() {
		int count = 0; 
		for (int i=0; i<20000; i++) {
			if (fibonacci(i)%2==0 && ((count + fibonacci(i)) < 400))
				count += fibonacci(i);  
		}
		return count; 
	}
	
	public static int fibonacci(int n) {
		if(n==0 || n==1) 
			return n;
		return fibonacci(n-1)+ fibonacci(n-2);
	}
}

