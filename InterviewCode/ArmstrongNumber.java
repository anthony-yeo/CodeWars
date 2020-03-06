

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println("Number : " + n + " is " + (isArmStrong(n) ? "armstrong number" : "not a armstrong number"));

	}

	public static boolean isArmStrong(int number) {
		int result = 0;
		int orig = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (orig == result) {
			return true;
		}
		return false;
	}

	public static boolean isArmstrong(int input) {

		Integer number = 0;
		char[] s = ("" + input).toCharArray();

		for (char c : s) {
			number += Integer.valueOf("" + c) * Integer.valueOf("" + c) * Integer.valueOf("" + c);
			if (number.compareTo(input) == 1) {
				return false;
			}
		}

		if (number.compareTo(input) == 0) {
			return true;
		}
		return false;
	}

}
