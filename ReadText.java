import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * 
 * @author Luis Gonzalez 
 */
public class ReadText {
    /** The Main Menu for the user */
    /** file is stored as a string */
    public String file;
    /** DELMIN final set of Chars that will be taken out from text */
    final String DELIMS = "[ .,-_^?!()*:\"â€â€œ]+";

    /**
     * Ctor for the Main menu to use
     */
    public ReadText(){
    }

    /**
     * Based on Main Menu, it will go to the corresponding method
     * will loop until the user wants to go back to the main menu
     * @param line string to the ArrayFreq
     * @param arryList arrayList of MyWordCount to the Results
     */
    public void startArrayListSort(){
        while (true) {
            /**
             * Ctors to create and store in ArrayList
             * Ctore to show results from ArratList
             * Menu to select the book the user wants to read
             */
            ArrayFreq freq = new ArrayFreq();
            Results infoFreq = new Results();
            System.out.println();
            System.out.println("Before we begin, what book would you like to read?  ");
            System.out.println("Pick one of the three Data structures you would like to use :) ");
            System.out.println("********************ArrayList Menu*****************************");
            System.out.println("Single Sentence --------------------------------------------(1)");
            System.out.println("Lincoln ----------------------------------------------------(2)");
            System.out.println("Wizard of Oz -----------------------------------------------(3)");
            System.out.println("War and Peace ----------------------------------------------(4)");
            System.out.println("Return to Main Menu ----------------------------------------(5)");
            System.out.println("***************************************************************");

            Scanner arrayCmd = new Scanner(System.in);
            int commands = arrayCmd.nextInt();

            if (commands == 1){ 
                long start = System.currentTimeMillis();
                try {
                    Scanner scanner = new Scanner(
                    new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex1_sentence.txt"));
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        freq.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                    
                    ArrayList<MyWordCount> arrayList;
                    arrayList = freq.createList();
                    infoFreq.getarrayList(arrayList);
                    infoFreq.runRestuls();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
            } 
            else if (commands == 2){
                long start = System.currentTimeMillis();
                try {
                    Scanner scanner = new Scanner(
                    new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex2_lincoln.txt"));
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        freq.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                   
                    ArrayList<MyWordCount> arrayList;
                    arrayList = freq.createList();
                    infoFreq.getarrayList(arrayList);
                    infoFreq.runRestuls();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
            } 
            else if (commands == 3){
                long start = System.currentTimeMillis();
                try {
                    Scanner scanner = new Scanner(
                    new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex3_wizard_oz.txt"));
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        freq.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");
                    ArrayList<MyWordCount> arrayList;
                    arrayList = freq.createList();
                    infoFreq.getarrayList(arrayList);
                    infoFreq.runRestuls();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
            } 
            else if (commands == 4){
                long start = System.currentTimeMillis();
                try {
                    Scanner scanner = new Scanner(
                    new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex4_war_and_peace.txt"));
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        freq.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                    
                    ArrayList<MyWordCount> arrayList;
                    arrayList = freq.createList();
                    infoFreq.getarrayList(arrayList);
                    infoFreq.runRestuls();
                }
                catch (FileNotFoundException e){
                    e.printStackTrace();
                }
            } 
            else if (commands == 5){
                break;
            }
        }
    }

    /**
     * Based on Main Menu, it will go to the corresponding method
     * will loop until the user wants to go back to the main menu
     * @param line string to the HashFreq
     * @param hashList hashList of MyWordCount to the Results
     */
    public void startHashSort(){
        while (true) {
            /**
             * Ctors to create and store in Hash Map
             * Ctore to show results from Hash Map
             */
            Results infoHash = new Results();
            HashFreq hash = new HashFreq();
            System.out.println();
            System.out.println("Before we begin, what book would you like to read?  ");
            System.out.println("Pick one of the three Data structures you would like to use :) ");
            System.out.println("**********************HashMap Menu*****************************");
            System.out.println("Single Sentence --------------------------------------------(1)");
            System.out.println("Lincoln ----------------------------------------------------(2)");
            System.out.println("Wizard of Oz -----------------------------------------------(3)");
            System.out.println("War and Peace ----------------------------------------------(4)");
            System.out.println("Return to Main Menu ----------------------------------------(5)");
            System.out.println("***************************************************************");

            Scanner hashCmd = new Scanner(System.in);
            int commands = hashCmd.nextInt();

            if (commands == 1){
                long start = System.currentTimeMillis();
                try {
                    Scanner scanner = new Scanner(
                    new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex1_sentence.txt"));
                    while (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();                        
                        String[] tokens = line.split(DELIMS);
                        hash.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                   
                    ArrayList<MyWordCount> hashList;
                    hashList = hash.end();
                    infoHash.getarrayList(hashList);
                    infoHash.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 2){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex2_lincoln.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        hash.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                    
                    ArrayList<MyWordCount> hashList;
                    hashList = hash.end();
                    infoHash.getarrayList(hashList);
                    infoHash.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 3){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex3_wizard_oz.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        hash.addValues(tokens);
                    }
                    scanner.close();
                    hash.end();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                   
                    ArrayList<MyWordCount> hashList;
                    hashList = hash.end();
                    infoHash.getarrayList(hashList);
                    infoHash.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 4){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex4_war_and_peace.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        hash.addValues(tokens);
                    }
                    scanner.close();
                    hash.end();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                  
                    ArrayList<MyWordCount> hashList;
                    hashList = hash.end();
                    infoHash.getarrayList(hashList);
                    infoHash.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 5){
                break;
            }
        }
    }
  
    /**
     * Based on Main Menu, it will go to the corresponding method
     * will loop until the user wants to go back to the main menu
     * splits words into string for the MyBst to use
     * bstList of MyWordCount to the Results
     */
	public void startBstSort(){
        /**
         * Ctor to create and store in BST
         * Ctor to show results from BST
         */
        Results infoBst = new Results();
        MyBST bst = new MyBST();
        while (true){
            System.out.println();
            System.out.println("Before we begin, what book would you like to read?  ");
            System.out.println("Pick one of the three Data structures you would like to use :) ");
            System.out.println("**************************Bst Menu*****************************");
            System.out.println("Single Sentence --------------------------------------------(1)");
            System.out.println("Lincoln ----------------------------------------------------(2)");
            System.out.println("Wizard of Oz -----------------------------------------------(3)");
            System.out.println("War and Peace ----------------------------------------------(4)");
            System.out.println("Return to Main Menu ----------------------------------------(5)");
            System.out.println("***************************************************************");

            Scanner bstCmd = new Scanner(System.in);
            int commands = bstCmd.nextInt();

            if (commands == 1){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex1_sentence.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        bst.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                   
                    ArrayList<MyWordCount> bstList;
                    bstList = bst.createList();
                    infoBst.getarrayList(bstList);
                    infoBst.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 2){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex2_lincoln.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        bst.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                  
                    ArrayList<MyWordCount> bstList;
                    bstList = bst.createList();
                    infoBst.getarrayList(bstList);
                    infoBst.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 3){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex3_wizard_oz.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        bst.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");                
                    ArrayList<MyWordCount> bstList;
                    bstList = bst.createList();
                    infoBst.getarrayList(bstList);
                    infoBst.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 4){
                long start = System.currentTimeMillis();
                try{
                    Scanner scanner = new Scanner( new File("/Users/luisg/OneDrive/Desktop/Java/program02/DATA/ex4_war_and_peace.txt"));
                    while( scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        line = line.toLowerCase();                        
                        line = line.trim();
                        String[] tokens = line.split(DELIMS);
                        bst.addValues(tokens);
                    }
                    scanner.close();
                    long end = System.currentTimeMillis();
                    long durationMillis = end - start;
                    System.out.println("----------------------Time-----------------------------------------");
                    System.out.println();
                    System.out.println("         Total time it took to read and store this file: " + durationMillis);
                    System.out.println();
                    System.out.println("----------------------Time-----------------------------------------");
                    ArrayList<MyWordCount> bstList;
                    bstList = bst.createList();
                    infoBst.getarrayList(bstList);
                    infoBst.runRestuls();
                }
                catch( FileNotFoundException e){
                    e.printStackTrace();
                }
            }
            else if (commands == 5){
                break;
            }
        }
    }
}