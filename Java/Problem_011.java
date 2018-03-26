/*
In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem_011{
	public static void main(String [] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("Problem_011.txt"));
		long start = System.currentTimeMillis(); 
		int t = 0, m = 0; 
		int[][] Grid = new int[20][20]; 
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
				if(s.hasNextInt()) {
					Grid[i][j] = s.nextInt();
				}
			}
		}
		s.close();

//left, right
		for(int i=0; i<20; i++) {
			for(int j=0; j<17; j++) {
				t = Grid[i][j] * Grid[i][j+1] * Grid[i][j+2] * Grid[i][j+3]; 
				if(t>m) {
					m = t; 
				}
			}	
		}
		
//up,down
		for(int i=0; i<17; i++) {
			for(int j=0; j<20; j++) {
				t = Grid[i][j] * Grid[i+1][j] * Grid[i+2][j] * Grid[i+3][j]; 
				if(t>m) {
					m = t; 
				}
			}	
		}


//right diagonally
		for(int i=0; i<17; i++) {
			for(int j=0; j<17; j++) {
				t = Grid[i][j] * Grid[i+1][j+1] * Grid[i+2][j+2] * Grid[i+3][j+3]; 
				if(t>m) {
					m = t; 
				}
			}	
		}				
				
//left diagonally 
		for(int i=0; i<17; i++) {
			for(int j=3; j<20; j++) {
				t = Grid[i][j] * Grid[i+1][j-1] * Grid[i+2][j-2]* Grid[i+3][j-3]; 
				if(t>m) {
					m = t; 
				}
			}	
		}

		long stop = System.currentTimeMillis(); 
		System.out.println("sum: " + m );
		System.out.println(stop - start + " ms");
	}
}
