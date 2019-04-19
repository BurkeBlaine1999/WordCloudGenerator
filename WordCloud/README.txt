=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
* * * * * * * * * * * WORD CLOUD GENERATOR -> G00354397 * * * * * * * * * * * 
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+

Welcome to my Word Cloud Generator Project!
___________________________________________
Instructions for use :

1) Open the CMD console

2) Go to the wordcloud Directory

3) Input your java path e.g.
   Path = new %path%;C:\Program Files\Java\jdk-10.0.2\bin

4) Then use enter the following.. java –cp ./wordcloud.jar ie.gmit.sw.Runner

) You will then be brought to the menu
   Enter 1 to scan from a file
   Enter 2 to scan from a Web URL

) You will be prompted to enter a text File directory / Web url 

   How to find a text file Directory
 	  1) Go to the folder that contains your desired text file
  	  2) Click on the Navigation Bar of the folder
	  3) Type cmd into the Navigation Bar
	  4) This should open a console , copy the folder directory e.g. C:\Users\Owner\Documents
	  5) Once copied (CTRL + C) , paste this into the terminal (CTRL + ) and type the name of your file after ward
	     e.g. C:\Users\Owner\Documents\filename.txt
	  
	     *NOTE --> This may take a minute to load the file
	  6) Once you choose your file , it will be scanned and all words from the text file will be displayed
	  7) Once loaded you will be asked to input the name of which you wish the picture to be saved as.
	  8) You will then be asked how many words you would like to print in the Image
	  9) Your image will then be created and can be found in the wordCloud folder.

   How to find a Web URL
 	  1) Go to your Desired web site
  	  2) Click on the Navigation Bar
	  3) Copy the link to the web Site
	  4) Once copied , paste this into the terminal and hit enter
	  *NOTE --> This may take a minute 
	  5) Once you choose your Web Page it will be scanned and all words from the web page will be displayed
	  6) You will then be asked to input the name of which you wish the picture to be saved as.
	  7) You will then be asked how many words you would like to print in the Image
	  8) Your image will then be created and can be found in the wordCloud folder.


___________________________________________
Features of my project!
___________________________________________

A File Parser
==================
My project contains a file parser which works by using scanners to scan through files
and simply put them into an ArrayList and are then ready for deployment

A Url Parser
==================
My project contains a Url parser which works by using scanners and an Input Stream Reader 
to scan through Urls and then all scanned words are ran through a delimeter to filter unwanted symbols.
They are then placed into an arraylist and are now ready for deployment

An Image Generater
==================
For my image generator I use a wide variety of imports such as java.awt and java.awt.image .
How this works is the Arraylist from either the Url parser or file parser is passed through giving us our words.
What then happens is the user is asked a series of questions regarding the image name , number of words and image size.
Once answered the image is created using a buffered Image and graphics.
This image then can be found in the wordclouds folder!

___________________________________________
Additional functions to the project
___________________________________________

+=+=+=+= Image Size +=+=+=
In the parser and Urlparser classes I added a function where you will be asked to 
input an X-axis and Y-axis for your WordCloud image. 

This works as once you set your X and Y axis , the random number generators are set to your inputs therefore
alowing them to print all over your image and not just in a limited space!

+=+=+=+= Search Function (Commented Out --> Causes Errors)+=+=+=+=
In the parser and Urlparser classes I added a search function.
It begins by asking the user "Would you like to search any specific words? (yes/no) ?".
If 'yes' is entered the user is then prompted to input a word.
Once a word has been selected and entered , using a for loop and an If Statement , it searches through the filtered list of words to see if the word occurs.
if it has not occured the user is prompted with a message saying that the word could not be found but if the word happens to be found it will display the word followed by how many times it occured.






