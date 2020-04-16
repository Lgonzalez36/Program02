/**
 * Interface for a Binary Search Tree (BST) for The Freq, Program #2.
 */

public interface Bst210{
    
    /**
     * Add the (String, WordCount) key-value pair to the BST.
     * It is already exists in the BST, then do nothing.
     * @param key The word
     * @param value The WordCount object for the word
     * @return 
     */

    /**
     * Returns the WordCount object (value) for the given word (key).
     * @param key The word we're searching for
     * @return Returns the WordCount for the key, or null if none exists
     */
    public MyWordCount get( String key);

    /**
     * Removes all objects in the BST.
     */
    public void clear();

    /**
     * Returns true if the BST has no items; false otw.
     * @return Returns true if BST is empty, has no items.
     */
    public boolean isEmpty();

    /**
     * Returns the number of items in the BST.
     * @return Returns the number of items
     */
    public int numItems();

}