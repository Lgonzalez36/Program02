import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Results {
    private ArrayList<MyWordCount> list;
    public MyWordCount wc;

    public Results() {
    }
    
    public void runRestuls(){

        while (true){
            System.out.println();
            System.out.println("              Lets check the results out!                      ");
            System.out.println("**********************Results Menu*****************************");
            System.out.println("Total words ------------------------------------------------(1)");
            System.out.println("Number of Different words-----------------------------------(2)");
            System.out.println("Frequency of War -------------------------------------------(3)");
            System.out.println("Frequency of Peace -----------------------------------------(4)");
            System.out.println("Top 20 Words -----------------------------------------------(5)");
            System.out.println("Or return to Book Selection --------------------------------(6)");
            System.out.println("***************************************************************");
            
            Scanner scanner = new Scanner(System.in);
            int commands = scanner.nextInt();
            
            System.out.println("------------------------------------------------------------------------------------------");

            if (commands == 1){
                totalWords(); // count the values of each MyWordCount in list
            }
            else if (commands == 2){ 
                diffWords(); //size of the array
            }
            else if (commands == 3){
                freqOfWar(); //depending of the book
            }
            else if (commands == 4){
                freqOfPeace(); // depending of the book
            }
            else if (commands == 5){
                top20(); // sort it and find the 20th spot
            }
            else if (commands == 6){
                list.clear(); // clears the results
                break;
            }
        }
    }
    public void totalWords(){
        int total = 0;
        for ( MyWordCount wc : list){
            total = total + wc.getCount();
        }
        System.out.println("Total Words in this file" + " " + total);

    }

    public void top20() {
        FreqComparator cmp = new FreqComparator();
        Collections.sort(list, Collections.reverseOrder(cmp));
        if ( list.size() > 20){
            for ( int i = 0; i < 19; i++){
                System.out.println("Top 20 Words" + " " + list.get(i).getWord() + " " + list.get(i).getCount());
            }
        }
        else{
            for ( int i = 0; i < list.size(); i++){
                System.out.println("Top Words" + " " + list.get(i).getWord() + " " + list.get(i).getCount());
            }
        }
    }

    public void freqOfWar() {
        int warCount = 0;
        String war = "war";
        for ( int i = 0; i < list.size(); i++){
            if ( list.get(i).getWord().equals(war)){
                warCount = warCount + list.get(i).getCount();
            }

        }
        System.out.println("The number of times War is in this text: " + warCount);
    }

    public void freqOfPeace() {
        int peaceCount = 0;
        String peace = "peace";
        for ( int i = 0; i < list.size(); i++){
            if ( list.get(i).getWord().equals(peace)){
                peaceCount = peaceCount + list.get(i).getCount();
            }
        }
        System.out.println("The number of times peace is in this text: " + peaceCount);
    }

    public void diffWords() {
        System.out.println("The number of different words in this text: " + list.size());
    }

    public ArrayList<MyWordCount> getarrayList(ArrayList<MyWordCount> arrayList) {
        list = arrayList;
        return list;
        
    }
}