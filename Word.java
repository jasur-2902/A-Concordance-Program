package Assignment1;

/** 
 * A blueprint class for Word Object
 * 
 * @author Jasur Shukurov 
 * @version 09/01/2019
 */


public class Word {
	

	private String word; // The actual word
	private int count; // The frequency of the word in the text
	
	/**
     * Constructor: initializes all attributes
     */
	public Word() {
		this.word = "";
		this.count = 1;
	
	}
	
	
	/**
     * Constructor: initializes all attributes
     *
     * @param String, newWord the actual word
     */
	public Word(String newWord) {
		this.word = newWord;
		this.count = 1;
	
	}
	
	
	/**
     * setWords: method changes the word 
     *
     * @param String, newWord new word 
     */
	public void setWord(String newWord) {
		this.word = newWord;
	}
	
	
	 /**
     * getWord: 
     *
     * @return String, the word
     */
	public String getWord() {
		return this.word;
	}
	
	
	/**
     * increaseCount: adds 1 to the frequency of the word
     * 
     * Precondition:  Word object is created and valid
     * Postcondition: the count (frequency) of the word increased by one 
     * 
     */
	public void increaseCount() {
		this.count++;
	}
	
	/**
     * equals: compare the status of two Word objects.
     * 
     * @param Word, thatWord a Word object
     * @return boolean, true if calling object (this) is in the same state as the Word object received as a parameter, and false otherwise.
     */
	public boolean equals(Word thatWord){
		if(thatWord.equals(null))
			return false;
		if(this.word.equals(thatWord.word))
			return true;
		else 
			return false; 
	}
	
    /**
     * toString: return String representation of this Word object
     * Precondition: this Word object is created and valid
     *
     * @return String, a representation of this object
     */
	public String toString() {
		return this.word + " : " + this.count;
	}

}
