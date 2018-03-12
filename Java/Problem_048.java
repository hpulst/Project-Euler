import java.math.BigInteger;

public class Problem_048 {
	public static void main(String[] args) {
		BigInteger n = BigInteger.ZERO; 

		for (int i=1; i<=1000; i++) {
			n = n.add(BigInteger.valueOf(i).pow(i)); 
		}
		System.out.println("Answer: " + n.toString().substring(n.toString().length()-10));
	}
}
