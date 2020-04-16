import java.util.ArrayList;
/** 
 * 
 * @author Luis Gonzalez 
 */
public class MyBSTNode {
    /** MyBSTNode takes the input from MyBST Strings and value(MyWordCount)
     * and stores them in new nodes based on its value and the value of parent
     */

    /**Makes a arrayList for everytime a new book will use this class */
    ArrayList<MyWordCount> flatList = new ArrayList<>();
    /** MyWordCount is the object im using and storing words into */
    private MyWordCount value;
    /** String key is the string used to store in bst */
    private String key;
    /** Left Node of the root */
    private MyBSTNode left;
    /** Right Node of the root */
    private MyBSTNode right;

    /**
     * Ctor for to access MyWordCount
     * @param key
     * @param value
     */
    public MyBSTNode(String key, MyWordCount value) {
        this.key = key;
        this.value = value;
    }
    
    /**
     * This Method takes the key and the value and sorts it into a BST tree
     */
    public void put( String key, MyWordCount value){
        if ( key.compareTo( this.key ) < 0 ){           
            if ( left != null ){                 
                left.put( key, value );             
            }             
            else{                 
                left = new MyBSTNode( key, value );             
            }         
        }
        else if ( key.compareTo( this.key ) > 0 ){
            if ( right != null ){
                right.put( key, value );
            }
            else{
                right = new MyBSTNode( key, value );
            }
        }
        else{
            // It is the word, increment count
            this.value.incrementCount(1);
        }
    }
  
    /**
     * This Method takes in the root after Bst is done and creates an arrayList
     * in order of the lest node to the right most nost
     * adds the results into arrayList
     * @param root2array
     * @param list
     */
    public void inOrder(MyBSTNode root2array, ArrayList<MyWordCount> list) {
        if( root2array == null){
            return;
        }
        inOrder(root2array.left, list);
        list.add( root2array.value);
        inOrder(root2array.right, list);
    }

    /**
     * This Method creates arrayList by calling inOrder Method 
     * @param root is what gets put in the Method inOrder
     * @return it returns arrayList to MyBSt then to ReadText
     */
    public ArrayList<MyWordCount> createList(MyBSTNode root) {
        inOrder(root, flatList);
        return flatList;
	}
}