import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem_013{
	public static void main(String [] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("Problem_013.txt")).useDelimiter("[;\\r\\n]+");
		long start = System.currentTimeMillis(); 
		BigInteger i = BigInteger.valueOf(1);
		BigInteger j = BigInteger.valueOf(1);

		while(s.hasNextBigInteger()) {	
			i = s.nextBigInteger();
			j = j.add(i);
		}

		s.close();
		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + j.toString().substring(0,10) );
		System.out.println(stop - start + " ms");
	}
}
