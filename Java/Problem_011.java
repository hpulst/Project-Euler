/*
In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 */

import java.io.*;
import java.util.Scanner; 

public class Problem_011 {

	public static void main(String[] args) throws FileNotFoundException {
		String Filepath = "numbers.txt"; 
		Scanner scan = new Scanner(new File(Filepath));
		int[][] Grid = new int[20][20]; 
		int product = 0; 
		int largest = 0; 

		for (int i=0; i<20; i++) {
			for (int j=0; j<20; j++) {
				if(scan.hasNextInt()) {
					Grid[i][j] = scan.nextInt(); 
				}
			}
		}

		// check horizontally
		for (int i=0; i<20; i++) {
			for(int j=0; j<17; j++) {
				System.out.println(Grid[i][j]);
				product = Grid[i][j] * Grid[i][j+1]* Grid[i][j+2]*Grid[i][j+3]; 
				if (product > largest)
					largest = product; 
			}
		}

		// Check vertically
		for(int i = 0; i < 17; i ++){
			for(int j = 0; j < 20; j++){
				product = Grid[i][j] * Grid[i + 1][j] * Grid[i + 2][j] * Grid[i + 3][j];
				if(product > largest){
					largest = product;
				}
			}
		}

		// Check diagonally right
		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 17; j++){
				product = Grid[i][j] * Grid[i + 1][j + 1] * Grid[i + 2][j + 2] * Grid[i + 3][i + 3];
				if(product > largest){
					largest = product;
				}
			}
		}

		// Check diagonally left
		for(int i = 0; i < 17; i ++){
			for(int j = 3; j < 20; j ++){
				product = Grid[i][j] * Grid[i + 1][j - 1] * Grid[i + 2][j  - 2] * Grid[i + 3][j - 3];
				if(product > largest){
					largest = product;
				}
			}
		}
		System.out.println(largest);		
	}
}