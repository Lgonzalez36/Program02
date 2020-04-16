import java.util.ArrayList;

/** 
* 
* @author Luis Gonzalez 
*/
public class MyBST extends FreqAbs implements Bst210 {
    /** MyBST takes the input from ReadText Strings and stores
    * word freq
    */

    /**Makes a new hash map for everytime a new book will use this class */
    ArrayList<MyWordCount> flatList = new ArrayList<>();
    /** MyWordCount is the object im using and storing words into */
    public MyWordCount value;
    /** totalnumItems was intended to be used in this file. kept to avoid error msg */
    public int totalnumItems;
    /** word was intended to be used in this file. kept to avoid error msg */
    public int numItems;
    /** Root is the initial root for the first word in MyBST */
    private MyBSTNode root;
    
    /** 
     * Ctor for the ReadText to use
     */
    public MyBST(){
    }

    /**
     * Takes in param to check for freq
     * if root is null than the first word is the root
     * otherwise it sends key(word) and value to the put
     * method in MyBSTNode 
     * @param key
     * @param value
     */
	public MyBSTNode addValues(String[] tokens){
        for (int i = 0; i < tokens.length; i++){
            if (root == null ){
                numItems = 1;
                value = new MyWordCount(tokens[i], numItems);
                root = new MyBSTNode( tokens[i], value );
            }
            else{
                value = new MyWordCount(tokens[i], 1);
                root.put( tokens[i], value );
            }
            numItems();
        }
        return root;
    }
    
    /**
     * This Method creates arrayList of MyWordcount from 
     * MyBSTNode class
     * after method is called and arrayList is made,
     * root goes to null so new books will not be interfered with
     * old bst
     * @return arrayList from converting Bst to arrayList in order
     */
    public ArrayList<MyWordCount> createList(){
        flatList = root.createList(root);
        root = null;
        return flatList;
    }

    /**
     * The rest of the methods below are not in use
     * All the work was able to be done in MyBSTNode
     * I just found it easier to do all in one place
     * Kept to avoid error msg
     */
    public void clear(){
        root = null;
        numItems();
    }
    
    public boolean isEmpty(){
        if ( root.equals(null));{
            return false;
        }
    }

    public int numItems(){
        if ( root.equals(null)){
            totalnumItems = 0;
        }
        else{
            totalnumItems ++;
        } 
         return totalnumItems;
    }

    public int countWord(String word){
        return 0;
    }

    public WordCount210[] createResultsArray(){
        return null;
    } 

    public String toString(){
        return "Word: " +  value.getWord() + "Freq: " + value.getCount();
    }
    
    public MyWordCount get(String key) {
        return null;
    }
    /**
     * The rest of the methods above are not in use
     * All the work was able to be done in MyBSTNode
     * I just found it easier to do all in one place
     * Kept to avoid error msg
     */
}