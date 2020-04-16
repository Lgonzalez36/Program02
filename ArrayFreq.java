import java.util.ArrayList;

/** 
 * 
 * @author Luis Gonzalez 
 */
public class ArrayFreq extends FreqAbs {
    /** ArrayFreq takes the input from ReadText Strings and stores
     * word freq
     */

    /**Makes a new list for everytime a new book will use this class */
    ArrayList<MyWordCount> list = new ArrayList<>();
    /** MyWordCount is the object im using and storing words into */
    public MyWordCount wc;
    /** Private boolean to search list */
    private boolean addToList;
    /** totalwords are not in use bc I didnt have to use it
     * only kept it there to eleminate error msg
     */
    public int totalwords;

    /**
     * Ctor for the ReadText to use
     */
    public ArrayFreq(){
    }

    /**
     * Counts the freq of each word
     * @return should return the freq of word but not in use
     */
    public int countWord(String word){
        totalwords++;
        return totalwords;
    }

    /**
     * Creates array from arrayList
     * should return array to ReadText.java but not in use
     * I used a different method. Kept to eleminate error msg
     * @return should return array to ReadText.java 
     */
    public MyWordCount[] createResultsArray(){
        MyWordCount[] array = new MyWordCount[list.size()];
        array = list.toArray( array);
        return array;
    }

    /**
     * Takes in the param to check for freq
     * If word is in list, then it increases word Count
     * If not, puts new word in list
     * @param word
     */
	public void addValues(String word[]){ 
        for (int i = 0; i < word.length; i++){ 
            int count = 1;
            for (int j = i+1; j < word.length; j++){
                if ( word[i].equals(word[j])){
                    count++;
                    word[j] = "0"; //Set words[j] to 0 to avoid printing visited word 
                }
            }
            if (count >= 1 && word[i] != "0"){
                if (list.size() == 0){
                    wc = new MyWordCount(word[i], count);
                    list.add(wc);
                }
                else if (list.size() == 1){
                    if (word[i].equals(list.get(0).getWord())){
                        list.get(0).incrementCount(count);
                    }
                    else{
                        wc = new MyWordCount(word[i], count);
                        list.add(wc);
                    }
                }
                else if ( list.size() > 1){
                    checkArrayList(word[i], count);
                }
            }
        } 
    }
    
    /**
     * In the final case were list size is > 1
     * This method is called to check whether to add or
     * increment word count if word already in list
     * @param checkword
     * @param countincrease
     */
	private void checkArrayList(String checkword, int countincrease){
        int listIndex = 0;
        addToList = true;
        while (addToList){
            if (checkword.equals(list.get(listIndex).getWord())){
                list.get(listIndex).incrementCount(countincrease);
                addToList = false;
            }
            else if (listIndex+1 == list.size() && !(checkword.equals(list.get(listIndex).getWord()))){
                wc = new MyWordCount(checkword, countincrease);
                list.add(wc);
                addToList = false;
            }
            else{               
                listIndex++;
            }
        }
    }

    /**
     * This method is called from ReadText.java
     * @return it returns list to send list to Results
     */
    public ArrayList<MyWordCount> createList(){
        return list;
    }
}