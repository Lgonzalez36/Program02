/**
 * Interface for a basic word counter for The Freq, Program #2.
 * These WordCount object are stored in our data structures while
 * the Freq is running.
 * @author Prof Bill
 */

public interface WordCount210 extends Comparable<MyWordCount>{
  

    /**
     * Getter for the word field.
     * There is no setter; the word field is immutable.
     * @return Returns the word being counted
     */
    public String getWord();
  
    /**
     * Getter for the count, which is the number of times a word has appeared.
     * @return Returns the count for the word
     */
    public int getCount();
  
    /**
     * Increment the count for this word.
     * 
     */
    public void incrementCount(int count);
  
  }