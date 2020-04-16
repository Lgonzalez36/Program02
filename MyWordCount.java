public class MyWordCount implements WordCount210{
    private String word;
    private int freqWord;

	public MyWordCount(String word, int freqWord) {
        this.word = word;
        this.freqWord = freqWord;
	}
    
	public MyWordCount() {
	}

	public String getWord() {
        String word = this.word;
        return word;
    }

    public int getCount() {
        return freqWord;
    }  
        
    public void incrementCount(int count) {
        freqWord = freqWord + count;
        count = 0;
    }

    public int compareTo(MyWordCount o) {
        return this.word.compareTo(o.getWord());
    }
    public String toString() {
        return  word + " freq = " + freqWord ;
    }

    
}
