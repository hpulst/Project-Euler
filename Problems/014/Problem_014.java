import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem_014{
	public static void main(String [] args) throws FileNotFoundException {
		long start = System.currentTimeMillis(); 
		
		long j = 0, i = 0, m = 1, n = 1; 
		while(i<1000000){
			i++;
			j = collatz(i);
			if(j>m) {
				m = j;
				n = i;
			}
		}

		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + m + " num: " + n);
		System.out.println(stop - start + " ms");
	}
	
	public static int collatz (long i) {  
		int j = 1; 
		while(i!=1 && i!=0) {
			if (i%2==0)
				i = i/2; 
			else 
				i = 3*i + 1; 
			j++;
		}
		return j; 
	}
}
