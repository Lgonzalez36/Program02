/**
 * Main class for Program 2
 * Feb 28, 2020
 * @author Luis Gonzalez
 */
public class Program02 {

    /**
     * main method for Program 2
     * will call Freq and run that class
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("\nHello, Program 2!!\n");
        /**
         * Ctor for Freq
         */
        Freq run = new Freq();
        run.readTxt();
    }
}