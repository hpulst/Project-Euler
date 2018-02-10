import java.io.*;
import java.util.Scanner; 

public class Problem_014 {

	public static void main(String[] args) throws FileNotFoundException {
		long max = 1; 
		long i;
		long length = 0; 
		long maxIdx = 0; 
		for (i=1; i<=1000000; i++) {
			length = makeSeq(i); 
			if(length > max) {
				max = length;
				maxIdx = i; 
			}
		}
		System.out.println("Max: " + maxIdx + "  CollatzSeq: " + max);
	}
	
	public static long makeSeq(long c) { 
		long chainSize = 1;
		while(c != 1) {
			if(c % 2 ==0)
				c = c/2;
			else 
				c = c*3 +1;
			chainSize++; 
		}
		return chainSize; 
	}
}