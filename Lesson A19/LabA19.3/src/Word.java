/**
 * @author Richard Huang
 */
public class Word{
    private String s;//actual word
    private int count;//repetitions
    /**
     * Creates an empty word
     */
    public Word(){
        s="";
        count=0;
    }
    /**
     * Creates a word with the given string
     * @param t string to be used as the word
     */
    public Word(String t){
        s=t;
        count=1;
    }
    /**
     * Returns the word
     * @return
     */
    public String getString(){
        return s;
    }
    /**
     * Returns the number of repetitions of the word
     * @return
     */
    public int getCount(){
        return count;
    }
    /**
     * Sets the value of the word
     * @param t String to set the word to
     */
    public void setWord(String t){
        s=t;
    }
    /**
     * Increments the repetition count by one
     */
    public void incrementCount(){
        count++;
    }
    /**
     * Decrements the repetition count by one
     */
    public void decrementCount(){
        count--;
    }
    /**
     * Returns the lexicographic difference
     * @param w Word to compare to
     * @return lexicographic difference
     */
    public int compareTo(Word w){
        return s.compareTo(w.getString());
    }
}