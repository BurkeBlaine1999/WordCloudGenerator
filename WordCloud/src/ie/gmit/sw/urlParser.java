package ie.gmit.sw;

import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class urlParser {
	
	public void urlParser(URL url) throws IOException  
	{
		int i =0;		
		File ignore = new File ("ignorewords.txt");
		
		//Frequency Table =+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		//=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+
		 
		 ArrayList<String> wordsUrl = new ArrayList<String>();
		 ArrayList<String> ignoreWords = new ArrayList<String>();
		 
			Scanner scan = new Scanner(new InputStreamReader(url.openStream()));
			Scanner ignoreScan = new Scanner(ignore);
			
			scan.useDelimiter("[^A-Za-z2É]+"); //Removes any unwanted Symbols
			
			System.out.println(url);
			
			//Adds all words to an array
			while(scan.hasNext())
			{		
				wordsUrl.add(scan.next());
				
				String nextWord = wordsUrl.get(i);
				//Increment word
					if(words.contains(nextWord))
					{
						//Find location of word and increments by 1
						int index = words.indexOf(nextWord);
						count.set(index, count.get(index)+1);
					}
					else 
					{
						words.add(nextWord);
						count.add(1);//Adds next word at bottom of list				
				}	
				
				i++;
			}
			
			i=0;
			
			
			//Adds all ignore words to an array
			while(ignoreScan.hasNext())
			{
				ignoreWords.add(ignoreScan.next());
			}
			
			//Filtering
			while(i < wordsUrl.size()) 
			{
				if(ignoreWords.contains(wordsUrl.get(i).toLowerCase()))
				{
					wordsUrl.remove(i);
				}
				else if(wordsUrl.get(i).length() < 3)
				{
					wordsUrl.remove(i);
				} 
				else 
				{
					i++;
				}
			}
			
			for(i=0;i<wordsUrl.size();i++) 
			{
				System.out.println(wordsUrl.get(i));
			}

			for(i=0;i<words.size();i++)
			{
				System.out.println(words.get(i) + " Occured " + count.get(i) + " Time(s)");							
			}
		
			imageGen p = new imageGen();	
			
				try {
					p.picture1(words,count);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
