/*
Using names.txt (right click and 'Save Link/Target As...'), 
a 46K text file containing over five-thousand first names, 
begin by sorting it into alphabetical order. 
Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, 
COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
"HAI","ELDEN","DORSEY","DARELL","BRODERICK","ALONSO"
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Problem_23 {


	public static void main(String[] args)throws IOException
	{
		String filePath = "names.txt";
		String a[] = FileToStrArray(filePath);
		Arrays.sort(a);//sorting the array
		long sum = 0l;



		//calculating score    
		for(int i =0 ; i < a.length ; i++)
		{ a[i] = a[i].replaceAll("\"","" ); //removing " " from each name.
		int NameSum =0; 
		for(int j = 0; j< a[i].length() ; j++)
		{
			NameSum += (a[i].charAt(j)-64);
		}
		NameSum =NameSum*(i+1);
		sum +=NameSum;
		}

		System.out.println(sum); 

	}


	//function to store the names in a string array.
	public static String[] FileToStrArray(String  filePath)throws IOException 
	{
		String names[] ={null};
		String S;
		int size = 0;
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			FileReader fr2 = new FileReader(filePath);
			BufferedReader br2 = new BufferedReader(fr2);


			while((S=br.readLine())!=null)
			{
				for(int i = 0 ; i < S.length() ; i++)
				{
					if(S.charAt(i)== '"')
						size++;
				}
				size =size/2;
			}
			names = new String[size];

			while((S=br2.readLine())!=null)
			{
				names=S.split(",");
			}



		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return names;
	}
}