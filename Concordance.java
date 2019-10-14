package Assignment1;

/** 
 * A blueprint class for Concordance Object
 * 
 * @author Jasur Shukurov 
 * @version 09/01/2019
 */

public class Concordance {
	
	public Word[] words; // Array of Word objects 
	private int wordCount;
	
	/**
     * Constructor: initializes all attributes
     */
	public Concordance() {
		this.words = new Word[400]; // Creating Array of Word objects with size of 200 
		this.wordCount = 0; 
		
	}
	
	/**
     * Constructor: initializes all attributes
     * 
     * @param int, the size of the array
     */
	public Concordance(int size) {
		this.words = new Word[size]; // Creating Array of Word objects with size of 200 
		this.wordCount = 0; 
		
	}
	
    /**
     * addWord: creates, and adds word object to the Array
     * 
     * Precondition: The array of Words has been created and is valid 
     * Postcondition: if the word hasn't been appeared then it will be added
     * to the array if not then increase the frequency of the word
     * 
     * @param String, the string of word that needs to be added to the array
     */
	public void addWord(String word) {
		Word newWord = new Word(word);
		

		//int matchs = this.words.hashCode()
		int searchResult = search(word,this.words, 0, this.wordCount);
		if(searchResult == -1) {
			words[this.wordCount] = newWord;
			this.wordCount++;
		}
		else {
			this.words[searchResult].increaseCount();
		}
		
	}
	
	/**
	   * search: binary search to find an Word inside our Array; 
	   *	
	   * Precondition: array should be sorted
	   * 
	   * @param key String   
	   * @param array Word[] 
	   * @param low int
	   * @param high int
	   * 
	   * @return int, indext of the element, or -1 if it's not in the array
	   */
	
	 // Source: https://introcs.cs.princeton.edu/java/42sort/BinarySearch.java.html
	 public int search(String key, Word[] array, int low, int high) {
		    
		         if (high <= low) 
		        	 return -1;
		         
		         int mid = low + (high - low) / 2;
		         int compare = array[mid].getWord().compareTo(key);
		         
		         if (compare > 0) 
		        	 return search(key, array, low, mid);
		         else if (compare < 0) 
		        	 return search(key, array, mid+1, high);
		         else              
		        	 return mid;
		     }
	
	 /**
	   * printResult: prints array
	   * 
	   * Precondition: array has objets inside 
	   * Postcondition: elements inside array has been printed 
	   * 	   
	   * */
 
	public void printResult () {
		for(int i=0; i<this.wordCount;i++) {
			System.out.println(this.words[i]);
		}
	}
	
	
	 /**
	   * getWordCount:  
	   * 
	   * @return int, wordCount 
	   * 	   
	   * */
	public int getWordCount() {
		return this.wordCount;
	}
	
}
