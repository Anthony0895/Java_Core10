package lgs;

import java.util.Scanner;

public class Number_of_words {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter sentence:");

		String word = scanner.nextLine();
		String textArray[] = word.split("[.!?]");

		System.out.println("The number of words in a sentence - " + countWords(word));
		
	}

	static int countWords(String text) {

		String textArray[] = text.split(" ");
		int counter = 0;

		for (int i = 0; i < textArray.length; i++) {

			if (textArray[i].length() > 1) {
				counter++;
			}
		}

		return counter;
	}

	
}
