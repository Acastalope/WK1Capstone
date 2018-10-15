package Week1CapstonePigLatin;

import java.util.Scanner;

public class Week1CapstonePigLatin {

	public static void main(String[] args) {

		String contin = "yes";

		//while(contin.equalsIgnoreCase("yes")) { // run the program while the condition yes is true

		Scanner sc = new Scanner(System.in); // scanner for user input

		String answer;
		do {

			System.out.println("Fun with Pig Latin/ Unfay ithway Igpay Atinlay"); // Greeting to user
			System.out.println();  // blank line

			System.out.println("Please enter a word to be translated: "); // Prompt for user to enter a word

			String word =sc.next();

			System.out.println("Translation: " + solve(word)); 

			System.out.println();
			System.out.println("Want to translate another word into Pig Latin? Yes or No"); 
			answer = sc.next();
		}
		while (answer.equalsIgnoreCase("Yes"));  


	}

	public static String solve (String word) {


		String temp = word.toLowerCase();
		char[] vowels = {'a', 'e', 'i','o','u'};
		char first = temp.charAt(0);


		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {
				return word +"way";

			}

		}


		word = word.substring(1);
		word += first + "ay";

		return word;

	}

}
