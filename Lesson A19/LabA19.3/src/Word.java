public class Word{
    private String s;
    private int count;
    public Word(){
        s="";
        count=0;
    }
    public Word(String t){
        s=t;
        count=1;
    }
    public String getString(){
        return s;
    }
    public int getCount(){
        return count;
    }
    public void setWord(String t){
        s=t;
    }
    public void incrementCount(){
        count++;
    }
    public void decrementCount(){
        count--;
    }
    public int compareTo(Word w){
        return s.compareTo(w.getString());
    }
}