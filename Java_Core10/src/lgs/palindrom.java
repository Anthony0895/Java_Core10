package lgs;

import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a five letter word:");

	String word = scanner.next();

	if (word.length() == 5) {
		String wordArray [] = word.split("");
		
		if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
			System.out.println("Entered word " + word + " - palindrom!");
		} else {
			System.out.println("Entered word  " + word + " - isn't palindrom!");
		}
	} else {
		System.err.println("You must enter a five-letter word!");
	}
}
}
