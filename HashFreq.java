import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

/** 
 * 
 * @author Luis Gonzalez 
 */
public class HashFreq extends FreqAbs {
    /** HashFreq takes the input from ReadText Strings and stores
     * word freq
     */

    /**Makes a new hash map for everytime a new book will use this class */
    HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
    /** MyWordCount is the object im using and storing words into */
    public MyWordCount wc;
    /** word was intended to be used in this file. kept to avoid error msg */
    private String word;
    /** freq was intended to be used in this file. kept to avoid error msg */
    private int freq;

    /**
     * Ctor for the ReadText to use
     */
    public HashFreq(){
    }

    /**
     * Supposed to make readable array but not in use kept to avoid error msg
     */
    public String toString(){
        return word + "the freq of the word" + "(" + freq + ")";
    }

    /**
     * Supposed count word freq but not in use kept to avoid error msg
     */
    public int countWord(String word) {
        return 0;
    }

    /**
     * Supposed create array but not in use kept to avoid error msg
     */
    public MyWordCount[] createResultsArray() {
        return null;
    }

    /**
     * Takes in param to check for freq
     * Hash does all the magic so that why the previous methods
     * are not in use, but kept to avoid error msg
     * @param tokens
     */
	public void addValues(String[] tokens){ 
        for (int i = 0; i < tokens.length; i++){
            if ( !hash_map.containsKey(tokens[i])){
                hash_map.put(tokens[i], 1);
            }
            else{
                hash_map.put(tokens[i], hash_map.get(tokens[i]) +1 );
            }
        }
    }   
    
    /**
     * After the file is done reading it will call this method
     * This method converts hash_map into an arrayList
     * @return The new list made from hash_map
     */
	public ArrayList<MyWordCount> end() {
        ArrayList<MyWordCount> list = new ArrayList<>();
        Set<Entry<String, Integer>> entrySet = hash_map.entrySet(); 
        ArrayList<Entry<String, Integer>> listOfEntry = new ArrayList<Entry<String,Integer>>(entrySet);
        for (Entry<String, Integer> entry : listOfEntry) {
            wc = new MyWordCount(entry.getKey(), entry.getValue());
            list.add(wc);
        }
        return list;
	}
}