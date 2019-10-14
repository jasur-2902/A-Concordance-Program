package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
//Imports
import java.util.Arrays; // Importing Arrays from Java Standard Library
import java.util.Scanner;


/** 
 * A driver class
 * 
 * @author Jasur Shukurov 
 * @version 09/01/2019
 */


public class Main {

	private static String text; 
	private static Scanner scn;
	
	//Driver method 
	public static void main(String[] args) {
		
		//Path to the txt file 
		File file = new File("src/Assignment1/text.txt");
        
		//Reading text from txt file 
		try {
			scn = new Scanner(file);
            while (scn.hasNextLine()) {
                text = scn.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // throwing an exception 
        }
        
       
        //Removing special characters, and converting to lowercase then spliting words 
		String[] array = text.replaceAll("[\"()'-+.^:,]","").toLowerCase().split(" ");
		
		// Creating new Concordance object 
		Concordance concordance = new Concordance(array.length);
		
		//Sorting an array
		Arrays.sort(array);
		
		
		//Finding the frequency of the words using concordance class 
		for(int i=0; i<array.length;i++) {
			//System.out.println(array[i]);
			concordance.addWord(array[i]);
		}
		
		
		//Printing resutls
		concordance.printResult();
		
		//Printing word counts
		System.out.println("\nWords: " + concordance.getWordCount());
		System.out.println("Total Words: " + array.length);
		
	}
	
}
