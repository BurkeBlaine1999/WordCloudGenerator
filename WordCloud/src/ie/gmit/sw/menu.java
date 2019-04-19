package ie.gmit.sw;

import java.util.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class menu {
	
	public void Menu() throws Exception{
		
		Scanner s = new Scanner(System.in);
		
		final int SENTINEL = -1;
		int choice;
		String filename;
		String Urlname;
		
		int select;
		int numWords;
		
		List<String> arrayList = new ArrayList<String>();
		List<String> arrayListUrl = new ArrayList<String>();
		
		System.out.println("\n");
		System.out.println("*_*_*_*Word Cloud*_*_*_*");
		System.out.println("*_*_*_* Generator *_*_*_*_");
		System.out.println("\n");
		System.out.println("1 : Enter a file name \n");	
		System.out.println("2 : Enter a URL name \n");	
		System.out.println("-1: EXIT\n");	

		choice = s.nextInt();		
		while(choice != SENTINEL)
		{
			if(choice == 1)
			{
				System.out.println("Please enter the name of the file :");
				//Enter File name
				filename = s.next();
				//Creates new Parser
				parser p = new parser();
				//Calls parser	
				p.Parse(filename); 
			}
			
			else if(choice == 2)
			{
				System.out.println("Please enter the name of the URL :");
				//Enter File name
				Urlname = s.next();
				URL url = new URL(Urlname);
				urlParser u = new urlParser();
				u.urlParser(url);
				
			}
			else
			{
				System.out.println("\nInvalid choice entered! Try again.");
			}
			
			System.out.println("\n");
			System.out.println("*_*_*_*Word Cloud*_*_*_*");
			System.out.println("*_*_*_* Generator *_*_*_*_");
			System.out.println("\n");
			System.out.println("1 : Enter a file name\n");	
			System.out.println("2 : Enter a URL name\n");	
			System.out.println("-1: EXIT\n");	
			
			choice = s.nextInt();
		}
		s.close();
	}

}

