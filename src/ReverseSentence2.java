
public class ReverseSentence2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String sampleSentence = "auto-generated method stub are us";
	    StringBuilder reversedSentence = new StringBuilder();
	    int emptycharacter = 0;
	    int wordStartIndex = 0;
	    
	    if (sampleSentence != null ) { 
		    
		    while (emptycharacter > -1){
		        emptycharacter = sampleSentence.indexOf(' ', wordStartIndex);
		        if (emptycharacter > -1) {
		        	reversedSentence.insert(0, sampleSentence.substring(wordStartIndex, emptycharacter)).insert(0, ' ');
		        }
		        else {
		        	reversedSentence.insert(0, sampleSentence.subSequence(wordStartIndex, sampleSentence.length()));
		        }
		        wordStartIndex = emptycharacter + 1;
		    }
	    }

	    System.out.println(reversedSentence.toString());
	}
}
