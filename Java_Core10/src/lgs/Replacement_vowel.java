package lgs;
import java.util.Scanner;

public class Replacement_vowel {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter text:");

		String text = scanner.nextLine();

		System.out.println(replaceVowels(text));
	}

	static String replaceVowels(String text) {

		char textArray[] = text.toCharArray();
		char vowelArray[] = { 'a','e','u','i','o','y','j','A','J','O','I','U','Y','E' };

		for (int i = 0; i < textArray.length; i++) {

			for (int j = 0; j < vowelArray.length; j++) {

				if (textArray[i] == vowelArray[j]) {
					textArray[i] = '-';
				}
			}
		}

		String newText = new String(textArray);
		return newText;
	}
}
