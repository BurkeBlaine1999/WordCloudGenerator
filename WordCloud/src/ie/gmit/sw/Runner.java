package ie.gmit.sw;

import java.io.FileNotFoundException;

public class Runner {
	public static void main(String[] args) throws Exception{
		
		menu m = new menu();
		
		try {
			m.Menu();
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
		}
	}
}

