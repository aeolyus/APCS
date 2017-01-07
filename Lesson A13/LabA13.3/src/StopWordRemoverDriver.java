public class StopWordRemoverDriver {
	public static void main(String args[]){
		StopWordRemover s=new StopWordRemover("in.txt","out.txt",50);
		s.removeStopWords();
	}
}
