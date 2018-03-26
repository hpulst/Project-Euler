import java.io.*;
import java.util.*;

public class Problem_022{
	public static void main(String [] args) throws FileNotFoundException {
		long start = System.currentTimeMillis(); 
		long sum = 0; 
		ArrayList<String> names = new ArrayList<String>(); 
		Scanner sc = new Scanner(new File("Problem_022.txt")).useDelimiter("[\",]+");

		while(sc.hasNext()) {	
			names.add(sc.next()); 
		}
		Collections.sort(names); 

		int t = 1; 
		for(int i = 0; i<names.size(); i++) {
			String name = names.get(i); 
			t = 0; 
			for(int j = 0; j<name.length(); j++) {
				int k = (int) name.charAt(j) - 64; 
				t += k; 
			}
			sum += (i + 1) * t; 
		}
		long stop = System.currentTimeMillis(); 
		System.out.println("Answer: " + sum + " in " + (stop - start) + " ms");
	}
}
