import java.util.Comparator;
/** 
 * 
 * @author Luis Gonzalez 
 */
public class FreqComparator implements Comparator<MyWordCount> {
    /** FreqComparator Compares the integer value of MyWordCount*/

    /**
     * Ctor for Results to use
     */
    public FreqComparator(){
    }

    /** This Method Compares the integer value of MyWordCount*/
    public int compare(MyWordCount o1, MyWordCount o2) {
        return (int) (o1.getCount() - o2.getCount());
    }
}