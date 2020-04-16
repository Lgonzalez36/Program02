import java.util.Scanner;

/** 
 * 
 * @author Luis Gonzalez 
 */
public class Freq {
    /**
     * This class is used to make as the main menu
     * user picks the path to store data
     */

    /** private read to call next menu */
    private ReadText read;
    
    /**
     * Ctor for the class ReadText
     */
    public Freq(){
        read = new ReadText();
    }
    
    /**
     * Gets the user input for the Main Menu
     */
    public void readTxt(){
        while (true){
            System.out.println();
            System.out.println("We will read a book and find out the frequency of Top 20!     ");
            System.out.println("Pick one of the three Data structures you would like to use :) ");
            System.out.println("********************Main Menu**********************************");
            System.out.println("Array List -------------------------------------------------(1)");
            System.out.println("Hash Map ---------------------------------------------------(2)");
            System.out.println("Binary Search Tree -----------------------------------------(3)");
            System.out.println("Exit Program02 :( ------------------------------------------(4)");
            System.out.println("***************************************************************");

            Scanner scanner = new Scanner(System.in);
            int commands = scanner.nextInt();
            
            System.out.println("------------------------------------------------------------------------------------------");

            if (commands == 1){
                read.startArrayListSort();
            }
            else if (commands == 2){ 
                read.startHashSort();
            }
            else if (commands == 3){
                read.startBstSort();
            }
            else if (commands == 4){
                break;
            }
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
}