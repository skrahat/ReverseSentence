
public class ReverseSentence {

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

	// method to reverse any given string
	public static String reverseMethod(String sample) {
		String result = "";
		int counter = 0;
		if (sample != null) {
			// for loop to iterate through the string reverse
			for (int i = sample.length() - 1; i > -1; i--) {
				char holder = sample.charAt(i);

				// checking for spaces
				if (holder == ' ') {

					// adding found word into result
					for (int j = 1; j <= counter; j++) {
						if (sample.charAt(i + j) != ' ') {
							result = result + sample.charAt(i + j);
						}

						// System.out.println(counter);
						// System.out.println(result);

					}
					result = result + " ";
					counter = 0;
				}
				// special case for first word without a space in string
				if (i == 0) {

					for (int j = 0; j <= counter; j++) {
						if (sample.charAt(i + j) != ' ') {
							result = result + sample.charAt(i + j);
						}

						// System.out.println(counter);
						// System.out.println(result);

					}

					counter = 0;
				}
				counter++;
			}
		}
		return result;
	}

}

/*
 * String sample = "This is the second sentence"; String result = ""; int
 * counter = 0;
 * 
 * for (int i = sample.length() - 1; i > -1; i--) { char holder =
 * sample.charAt(i);
 * 
 * if (holder == ' ' || i == 0) {
 * 
 * for(int j =0; j < counter + 1;j++) { result = result + sample.charAt(i+j);
 * System.out.println(counter); } counter=0; } counter++; }
 * 
 * System.out.println(result);
 */
