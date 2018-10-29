package Week1CapstonePigLatin;


import java.util.Scanner;

public class Week1CapstonePigLatin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // scanner for user input

		String answer;
		do {

			System.out.println("Fun with Pig Latin/ Unfay ithway Igpay Atinlay"); // Greeting to user
			System.out.println();  // blank line

			System.out.println("Please enter a word to be translated: "); // Prompt for user to enter a word

			String word =sc.next();

			if (word.length() >= 4) {
				System.out.println("Translation: " + solve(word));
			} else {
				System.out.println("Please enter a longer word.");
			}
			System.out.println();
			System.out.println("Want to translate another word into Pig Latin? Yes or No"); 
			answer = sc.next();
		}
		while (answer.equalsIgnoreCase("Yes"));  


	}

	public static String solve (String temp) {


		temp = temp.toLowerCase();
		char[] vowels = {'a', 'e', 'i','o','u'};
		char first = temp.charAt(0);
		char second = temp.charAt(1);
		char third = temp.charAt(2);
		char fourth = temp.charAt(3);

		for (int i = 0; i < vowels.length; i++) {
			if (first == vowels[i]) {
				return temp +"way";

			}
			else if (second == vowels[i]) {
				temp = temp.substring(1);
				temp += first + "ay";		
			}
			else if (third == vowels[i]) {
				temp = temp.substring(2);
				temp += Character.toString(first) + Character.toString(second) + "ay";		
			}
			else if (fourth == vowels[i]) {
				temp = temp.substring(3);
				temp += Character.toString(first) + Character.toString(second) + Character.toString(third) + "ay";
			}
		}


		

		return temp;

	}

}