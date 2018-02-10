import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.math.BigInteger;

public class Problem_013 {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("numbers.txt")).useDelimiter("[;\r\n]+");
		BigInteger bi1 = BigInteger.valueOf(1);
		BigInteger bi2 = BigInteger.valueOf(1);

		while (sc.hasNextBigInteger()) {
			bi1 = sc.nextBigInteger();
			bi2 = bi2.add(bi1); 
//			System.out.println(bi2);
		}
		sc.close(); 
		System.out.println(bi2.toString().substring(0, 10));
	}
}
