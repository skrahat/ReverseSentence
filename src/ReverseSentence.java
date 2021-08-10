
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample = "auto-generated method stub are us";
		String result = "";
		int counter = 0;
		//int t = 0;
		
		for (int i = sample.length() - 1; i > -1; i--) {
			char holder = sample.charAt(i);
			
			if (holder == ' ') {
				
				for(int j =1; j <= counter ;j++) {
					if(sample.charAt(i+j) != ' ') {
						result = result + sample.charAt(i+j);
					}
					
					System.out.println(counter);
					System.out.println(result);
					
				}
				result = result + " ";
				counter=0;
			}
			if (i == 0) {
				
				for(int j =0; j <= counter ;j++) {
					if(sample.charAt(i+j) != ' ') {
						result = result + sample.charAt(i+j);
					}
					
					System.out.println(counter);
					System.out.println(result);
					
				}
				
				counter=0;
			}
			counter++;
		}
		
		System.out.println(result);
	}

}

/*
 * String sample = "This is the second sentence";
		String result = "";
		int counter = 0;
		
		for (int i = sample.length() - 1; i > -1; i--) {
			char holder = sample.charAt(i);
			
			if (holder == ' ' || i == 0) {
				
				for(int j =0; j < counter + 1;j++) {
					result = result + sample.charAt(i+j);
					System.out.println(counter);
				}
				counter=0;
			}
			counter++;
		}
		
		System.out.println(result);
 */


