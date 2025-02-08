package Programming.Arrays;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(words(n));

	}

	private static String words(int n) {
		String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String words = "";

		if (n == 0) {
			return "Zero";
		}

		if (n >= 1000) {
			words += ones[n / 1000] + " Thousand";
			n = n % 1000;
			if (n > 0) {
				words += " ";
			}
		}

		if (n >= 100) {
			words += ones[n / 100] + " hundred";
			n = n % 100;
			if (n > 0) {
				words += " ";
			}
		}
		if (n >= 20) {
			words += tens[n / 10];
			n = n % 10;
			if (n > 0) {
				words += " " + ones[n];
			}
		} else if (n > 0) {
			words += ones[n];
		}

		return words.trim();
	}
}
