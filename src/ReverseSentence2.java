
public class ReverseSentence2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] sampleArray = { "we are playing out in cold", "a b c d e f g",
				"Find breaking Montreal & COVID-19 news, live coverage, weather, traffic, in-depth reporting, sports, local events and video.",
				null, "" };

		System.out.println("result= " + reverseMethod(sampleArray[0]));
		System.out.println("result= " + reverseMethod(sampleArray[1]));
		System.out.println("result= " + reverseMethod(sampleArray[2]));
		System.out.println("result= " + reverseMethod(sampleArray[3]));
		System.out.println("result= " + reverseMethod(sampleArray[4]));
	}
	
	public static String reverseMethod(String sampleSentence) {
		String result="";
	    StringBuilder reversedSentence = new StringBuilder();
	    int emptycharacterRef,initialWordCount = 0;
	    
	    if (sampleSentence != null ) { 
		    
		    do	{
		        emptycharacterRef = sampleSentence.indexOf(' ', initialWordCount);
		        //System.out.println(emptycharacterRef);
		        
		        if (emptycharacterRef > -1) {
		        	reversedSentence.insert(0, sampleSentence.substring(initialWordCount, emptycharacterRef)).insert(0, ' ');
		        }
		        else {
		        	reversedSentence.insert(0, sampleSentence.subSequence(initialWordCount, sampleSentence.length()));
		        }
		        initialWordCount = emptycharacterRef + 1;
		        //System.out.println(initialWordCount);

		    }
		    while (emptycharacterRef > -1);
	    }
		result = reversedSentence.toString();
		
		
		return result;
	}
}
