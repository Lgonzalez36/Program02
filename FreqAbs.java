
/**
 * This abstract class provides code-sharing for the countLine() and countWord()
 * methods across all Freq210 classes. It's handy!
 */
public abstract class FreqAbs implements Freq210 {

    /**
     * Count all the words in a line.
     * @param line The line to count
     * @return Returns the number of words counted!
     */
    public int countLine( String line) { 
      // call countWord() in here
      return 0;
    }
  
    /**
     * Count all the words in a file.
     * If the file name is bad, then no words are counted and zero is returned.
     * File help from this source: www.journaldev.com/709/java-read-file-line-by-line
     * 
     * @param fileName Name of the file to read
     * @return Returns the number of words counted!
     */
    public int countFile( String fileName) {
      // call countLine() in here
      return 0;
    }
  } 