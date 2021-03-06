
public class ReverseSentence2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sample test cases
		String[] sampleArray = { "we are playing out in cold", "a b c d e f g",
				"Find breaking Montreal & COVID-19 news, live coverage, weather, traffic, in-depth reporting, sports, local events and video.",
				null, "" };

		// printing results
		System.out.println(reverseMethod(sampleArray[0]));
		System.out.println(reverseMethod(sampleArray[1]));
		System.out.println(reverseMethod(sampleArray[2]));
		System.out.println(reverseMethod(sampleArray[3]));
		System.out.println(reverseMethod(sampleArray[4]));
	}

	// method to reverse sentence
	public static String reverseMethod(String sampleSentence) {
		String result = "";
		// creates a new StringBuilder object
		StringBuilder reversedSentence = new StringBuilder();
		int emptycharacterRef, initialWordCount = 0;

		// try catch to avoid null pointer
		try {
			// do-while loop to iterate till the end of the sentence
			do {
				emptycharacterRef = sampleSentence.indexOf(' ', initialWordCount);
				// System.out.println(emptycharacterRef);

				// insert each word after space is detected
				// the first word is inserted at first and therefore is the last word in the
				// complete string
				if (emptycharacterRef > -1) {
					reversedSentence.insert(0, sampleSentence.substring(initialWordCount, emptycharacterRef)).insert(0,
							' ');
				} else {
					reversedSentence.insert(0, sampleSentence.subSequence(initialWordCount, sampleSentence.length()));
				}
				initialWordCount = emptycharacterRef + 1;
				// System.out.println(initialWordCount);

			} while (emptycharacterRef > -1);
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught. Please provide a a string!");
		}
		// convert from stringBuilder to string
		result = reversedSentence.toString();

		return result;
	}
}
