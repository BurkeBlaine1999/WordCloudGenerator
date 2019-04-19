package ie.gmit.sw;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;



public class imageGen {
	
	public void picture(ArrayList<String> words, ArrayList<Integer> count) throws Exception
	{
		ArrayList<String> printWords = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int choice=0;
		int i = 0;
		//Variables for random 
		int randomWords=0;
		String randomWord;
		
		//Variables for average
		int average =0;
		String avgWords;
		
		//Variables for printing Images
		int maxWords=0;
		int Xaxis =0;
		int Yaxis=0;
		
		int randomX=0;
		int randomY=0;
		int randomF = 0;
		int randomC = 0;
		String imageName;

			
		System.out.print("Please enter the name you wish to save the image as : ");
		imageName = scan.nextLine(); 
		
		System.out.println("How many words would you like to allow in the image?");
		maxWords = scan.nextInt();
		
/*		System.out.println("Would you like to ...");
		System.out.println("1) Print random words");
		System.out.println("2) Print words that occur above average");
		
		if(choice == 1)
		{
			//Adds random words
			for(i=0;i<maxWords;i++)
			{
				randomWords = rand.nextInt(words.size());
				randomWord = words.get(randomWords);
				printWords.add(randomWord);
				
			}	
		}
		else if(choice == 2)
		{
			for(i=0;i<words.size();i++)
			{
				average = average + count.get(i); 
				
			}	

			
			for(i=0;i<words.size();i++)
			{
				if(count.get(i) > average )	
				{
					avgWords = words.get(i) ;
					printWords.add(avgWords);
				}
			}	
		}
		*/
		
		System.out.println("Please enter the size you would like your image..");
		System.out.print("X-Axis : ");
		Xaxis= scan.nextInt();
		System.out.print("Y-Axis : ");
		Yaxis= scan.nextInt();

		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 62);
		 BufferedImage image = new BufferedImage(Xaxis, Yaxis, BufferedImage.TYPE_3BYTE_BGR);
		 Graphics graphics = image.getGraphics();
		 graphics.setColor(Color.black);
		 
		for(i=0;i<maxWords ;i++) //words.size()
		{

			randomX = rand.nextInt(Xaxis);//X axis
			randomY = rand.nextInt(Yaxis);//Y axis
			randomF = rand.nextInt(3);//FONTS
			randomC = rand.nextInt(5);
			
			String printword;
			
			if(randomF == 0)
			{
				font = new Font(Font.MONOSPACED, Font.PLAIN, 20);
			}
			else if(randomF == 1)
			{
				font = new Font(Font.SANS_SERIF, Font.ITALIC, 20);
			}
			else if(randomF == 2)
			{
				font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
			}
			else if(randomF == 3)
			{
				font = new Font(Font.SERIF, Font.PLAIN, 20);
			}
			
			if(randomC == 0)
			{
				 graphics.setColor(Color.red);
			}
			else if(randomC == 1)
			{
				 graphics.setColor(Color.magenta);
			}
			else if(randomC == 2)
			{
				 graphics.setColor(Color.green);
			}
			else if(randomC == 3)
			{
				 graphics.setColor(Color.pink);
			}
			else if(randomC == 4)
			{
				 graphics.setColor(Color.yellow);
			}
			else if(randomC == 5)
			{
				 graphics.setColor(Color.orange);
			}
			 graphics.setFont(font);
			 
	 

				graphics.drawString(words.get(i), randomX, randomY); 
			 
		}
		
		 graphics.dispose();
		 ImageIO.write(image, "png", new File(imageName + ".png"));
			
		
		
	}
 
		 

	public void picture1(ArrayList<String> words, ArrayList<Integer> count) throws Exception 
	{
		
		ArrayList<String> printWords = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int choice=0;
		int i = 0;
		//Variables for random 
		int randomWords=0;
		String randomWord;
		
		//Variables for average
		int average =0;
		String avgWords;
		
		//Variables for printing Images
		int maxWords=0;
		int Xaxis =0;
		int Yaxis=0;
		
		int randomX=0;
		int randomY=0;
		int randomF = 0;
		int randomC = 0;
		String imageName;

			
		System.out.print("Please enter the name you wish to save the image as : ");
		imageName = scan.nextLine(); 
		
		System.out.println("How many words would you like to allow in the image?");
		maxWords = scan.nextInt();
		
/*		System.out.println("Would you like to ...");
		System.out.println("1) Print random words");
		System.out.println("2) Print words that occur above average");
		
		if(choice == 1)
		{
			//Adds random words
			for(i=0;i<maxWords;i++)
			{
				randomWords = rand.nextInt(words.size());
				randomWord = words.get(randomWords);
				printWords.add(randomWord);
				
			}	
		}
		else if(choice == 2)
		{
			for(i=0;i<words.size();i++)
			{
				average = average + count.get(i); 
				
			}	

			
			for(i=0;i<words.size();i++)
			{
				if(count.get(i) > average )	
				{
					avgWords = words.get(i) ;
					printWords.add(avgWords);
				}
			}	
		}
		*/
		
		System.out.println("Please enter the size you would like your image..");
		System.out.print("X-Axis : ");
		Xaxis= scan.nextInt();
		System.out.print("Y-Axis : ");
		Yaxis= scan.nextInt();

		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 62);
		 BufferedImage image = new BufferedImage(Xaxis, Yaxis, BufferedImage.TYPE_3BYTE_BGR);
		 Graphics graphics = image.getGraphics();
		 graphics.setColor(Color.black);
		 
		for(i=0;i<maxWords ;i++) //words.size()
		{

			randomX = rand.nextInt(Xaxis);//X axis
			randomY = rand.nextInt(Yaxis);//Y axis
			randomF = rand.nextInt(3);//FONTS
			randomC = rand.nextInt(5);
			
			String printword;
			
			if(randomF == 0)
			{
				font = new Font(Font.MONOSPACED, Font.PLAIN, 20);
			}
			else if(randomF == 1)
			{
				font = new Font(Font.SANS_SERIF, Font.ITALIC, 20);
			}
			else if(randomF == 2)
			{
				font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
			}
			else if(randomF == 3)
			{
				font = new Font(Font.SERIF, Font.PLAIN, 20);
			}
			
			if(randomC == 0)
			{
				 graphics.setColor(Color.red);
			}
			else if(randomC == 1)
			{
				 graphics.setColor(Color.magenta);
			}
			else if(randomC == 2)
			{
				 graphics.setColor(Color.green);
			}
			else if(randomC == 3)
			{
				 graphics.setColor(Color.pink);
			}
			else if(randomC == 4)
			{
				 graphics.setColor(Color.yellow);
			}
			else if(randomC == 5)
			{
				 graphics.setColor(Color.orange);
			}
			 graphics.setFont(font);
			 
	 

				graphics.drawString(words.get(i), randomX, randomY); 
			 
		}
		
		 graphics.dispose();
		 ImageIO.write(image, "png", new File(imageName + ".png"));
			
		
		
	}

}

