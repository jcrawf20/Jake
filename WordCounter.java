//Jake Crawford

import java.io.*;
import java.util.*;

public class WordCounter 
{
	public static void main(String[] args) throws IOException
	{
		//Sets up relevant variables
		String word, line, filename = args[0];
		BufferedReader in = null;
		try//Exits the program if the given filename can't be found
		{
			in = new BufferedReader(new FileReader(filename));
		}
		catch(FileNotFoundException e)
		{
			System.out.println(filename + " is not a valid file name.");
			System.exit(0);
		}
		
		Set<String> uniqueWords = new HashSet<String>();
		Set<String> odd = new HashSet<String>();
		Set<String> even = new HashSet<String>();
		Set<String> lessThanFive = new HashSet<String>();
		Set<String> moreThanFive = new HashSet<String>();
		line = in.readLine();
		
		while(line != null)//Iterates through the reader until the end of file and adds every word to the hashset
		{
			line = line.replaceAll(",|;|:|\\.|\\?|!|\\(|\\)|\\[.*?\\]", "");//Removes punctuation
			line = line.toLowerCase();//Prevents counting capitalized words more than once
			uniqueWords.addAll(Arrays.asList(line.split(" ")));//Splits the line into tokens and adds them to the hashset
			line = in.readLine();
		}
		in.close();
		
		for(String aword : uniqueWords)//Iterates through the uniqueWords and adds them to the appropriate sets
		{
			word = aword.toLowerCase();
			if((word.length() % 2) == 0)
				even.add(word);
			else
				odd.add(word);
			
			if(word.length() > 5)
				moreThanFive.add(word);
			else if(word.length() < 5)
				lessThanFive.add(word);
		}
		
		//Prints the results to the console
		System.out.println("\nUnique words: " + uniqueWords.size());
		System.out.println("Words with more than five letters: " + moreThanFive.size());
		System.out.println("Words with less than five letters: " + lessThanFive.size());
		System.out.println("Words with an even number of letters: " + even.size());
		System.out.println("Words with an odd number of letters: " + odd.size());
	}
}