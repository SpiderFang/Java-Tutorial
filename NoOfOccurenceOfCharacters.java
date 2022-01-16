//Java program to count the occurrences of each character
//https://www.geeksforgeeks.org/java-program-count-occurrences-character/
class NoOfOccurenceOfCharacters {
	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str)
	{
		
		// Create an array of size 256
		// i.e. ASCII_SIZE, handling only ASCII strings
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		// Initialize count array index, char as index(ASCII)
		for (int i = 0; i < len; i++) {
		    //System.out.println(str.charAt(i));
			count[str.charAt(i)]++;
		}
        /*
        for (int i = 0; i < len; i++) {
			System.out.println(count[str.charAt(i)]);
        }
        */
        
		// Create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}
            //System.out.println("find: "+find);
			if (find == 1)
				System.out.println(
					"Number of Occurrence of "
					+ str.charAt(i)
					+ " is:" + count[str.charAt(i)]);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "geeksforgeeks";
		getOccuringChar(str);
	}
}
