/**
 * Interface designs the top-leve object for Word Freq-ing.
 * For Program #2, we will create Freq210 classes for ArrayList, 
 * HashMap, and our BST.
 */
public interface Freq210 {

    /**
     * Increment the count for this word in the Freq.
     * @param word The word
     * @return Returns the current freq count for the word.
     */
    public int countWord(String word);
  
    /**
     * Increment word counts for the words in a line of text.
     * @param line The line
     * @return Returns the number of words in the line
     */
    public int countLine( String line);
  
    /**
     * Increment word counts for all the words in a file!
     * @param fileName The file name
     * @return Returns the number of words counted
     */
    public int countFile( String fileName);
  
    // note: You may want to add a countUrl() method here!
  
    /**
     * Creates and returns an array of WordCount results.
     * @return An array of WordCount210 results from all freq counting.
     */
    public WordCount210[] createResultsArray();
  
  }