package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		
		String s3 = s1;
		String s4 = "SHARATH";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println("no of character of s1 string is "+s1.length()); //8
		
		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println("s1 is empty " +s1.isEmpty()); // FALSE
		System.out.println("s2 is empty " +s2.isEmpty()); //TRUE
		
		/* concat(): combines two given strings */
		s1 = s1.concat(" webdriver");
		System.out.println(s1); // selenium webdriver
		System.out.println(s4.concat(" KUMAR"));
		System.out.println(s4);
		
		
		/* equals(): verifies two strings by considering case */
		System.out.println(s3.equals("selenium"));//true
		System.out.println(s3.equals("SELENIUM"));//false
		
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("Selenium WebDriver")); //true
		System.out.println(s1.equalsIgnoreCase(s3));//false

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s1.contains(s3)); //true
		System.out.println(s1.contains("python"));//false
		System.out.println(s1.contains("SELENIUM"));//false

		/* toLowerCase(): converts given string to lower case */
		s4 = s4.toLowerCase();
		System.out.println(s4); //sharath
		
		/* toUpperCase(): converts given string to upper case */
		s4 = s4.toUpperCase();
		System.out.println(s4); //SHARATH
		
		/* charAt(): returns a character at a given index number */
		System.out.println("char At : "+s1.charAt(10));//e
		
		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf("web"));
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s3.startsWith("sel")); //true
		System.out.println(s5.startsWith("WELCOME")); //false
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s3.endsWith("nium")); // true
		System.out.println(s5.endsWith("python")); //false
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));
		
		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values
		 * Note: substring() will include the beginning index character and excludes ending
		 * index character
		 */
		System.out.println(s3.substring(4)); //nium
		System.out.println(s3.substring(1, 6));//eleni

		/* toCharArray() return an array of characters inside the given string */
		char[] characters = s3.toCharArray();
//		for(char character : characters) {
//			System.out.print(character + "\t");
//		}
		System.out.println(characters.length);
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
//		for(String word : words) {
//			System.out.println(word);
//		}
		System.out.println("\nno of words in s5 string is: "+words.length);
		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println(s6);
		System.out.println(s6.trim());
		
		
		
		
//		//count duplicate characters
//		int count = 0;
//		char[] chars = s1.toCharArray();
//		for(char ch : chars) {
//			if(ch == 'e') {
//				count++;
//			}
//		}
//		System.out.println(count);

	}

}
