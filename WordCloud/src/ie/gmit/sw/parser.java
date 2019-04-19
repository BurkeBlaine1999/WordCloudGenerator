package ie.gmit.sw;

import java.util.*;
import java.io.*;

public class parser {
	
	public  void Parse(String filename) throws FileNotFoundException 
	{
		
		int SENTINEL = 999;
		int found = 0;
		int addedWords=0;
		int max=0;
		
		File file = new File (filename); //Converts the String filename to type File
		
		File ignore = new File("ignorewords.txt");
		
		List<String> inputWords = new ArrayList<String>();
		List<String> ignoreWords = new ArrayList<String>();
		
		//Frequency Table
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
	
		Scanner scan = new Scanner(file);
		Scanner s = new Scanner(System.in);
		Scanner ignoreScan = new Scanner(ignore);
		int i = 0;
		
		
		scan.useDelimiter("[^A-Za-z0-9É]+"); //Removes any unwanted Symbols
		
		//Sets i = what is read in and prints it out						
		while(scan.hasNext())
		{						
			inputWords.add(scan.next());
			
			String nextWord = inputWords.get(i);
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
		
		while(ignoreScan.hasNext()) 
		{
			ignoreWords.add(ignoreScan.next());
		}
		
		while(i < inputWords.size()) 
		{
			if(ignoreWords.contains(inputWords.get(i).toLowerCase())) {
				inputWords.remove(i);
			}
			else {
				i++;
			}
		}
		
		for(i=0;i<inputWords.size();i++)
		{
			System.out.println(inputWords.get(i));				
		}
		
		int average = 0;
		for(i=0;i<words.size();i++)
		{
			//Words = array of words that occured 
			//Count = count of the amount of times words occurred
			System.out.println(words.get(i) + " Occured " + count.get(i) + " Time(s)");	
				
			average = average + count.get(i);
			average = average / count.size();
		}	
		
	
//=============================================
// Attempt at searching for words		
//=============================================
/*		Scanner Option = new Scanner(System.in);
		
		String choice;
		String search = null;
		
		System.out.println("Would you like to search any specific words? (yes/no) ?");
		choice = Option.nextLine();
		if(choice == "yes")
		{
			System.out.print("Please enter the word you would like to search :");
			search = Option.nextLine();		
			for(i=0;i<words.size();i++)
			{
				if(words.get(i) == search)
				{
					//Words = array of words that occurred 
					//Count = count of the amount of times words occurred
					System.out.println(words.get(i) + " Occured " + count.get(i) + " Time(s)");	
					found = 1;
				}
						
			}	
			
		}
		if(found == 0)
		{
		 System.out.println(search + " cannot be found! ");
		}


		Option.close();		
		*/
//=============================================

		imageGen p = new imageGen();	
	//	return words;
		try {
			p.picture(words,count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}