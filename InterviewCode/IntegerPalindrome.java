

import java.math.BigInteger;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class IntegerPalindrome {

	private static Stack<Character> stack = new Stack<>();
	private static Deque<Character> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		sc.close();

		System.out.println("Number : " + n + " is " + (isPalindrome2(n) ? "palindrome" : "not a palindrome"));

	}

	public static boolean isPalindrome(BigInteger input) {

		if (input == null)
			return false;
		if (input.toString().isEmpty())
			return false;

		char[] s = input.toString().toCharArray();

		for (char c : s) {
			stack.push(c);
			queue.add(c);
		}

		for (int i = 0; i < s.length / 2; i++) {
			if (stack.pop() != queue.removeFirst()) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome2(BigInteger n) {

		try {
			String input = String.valueOf(n);
			if (input == null)
				return false;
			if (input.isEmpty())
				return false;

			if (input.length() == 1)
				return true;

			if (input.length() % 2 == 0) { // odd length
				return reverse(BigInteger.valueOf(Long.valueOf(input.substring(0, input.length() / 2))))
						.equals(BigInteger.valueOf(Long.valueOf(input.substring((input.length() / 2), input.length()))));
			} else { // even length
				return reverse(BigInteger.valueOf(Long.valueOf(input.substring(0, input.length() / 2))))
						.equals(BigInteger.valueOf(Long.valueOf(input.substring((input.length() / 2) + 1, input.length()))));
			}
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static BigInteger reverse(BigInteger n) {

		BigInteger reverse = BigInteger.ZERO;

		while (n.compareTo(BigInteger.ZERO) == 1) {
			BigInteger remainder = n.mod(BigInteger.valueOf(10));
			reverse = reverse.multiply(BigInteger.valueOf(10)).add(remainder);
			n = n.divide(BigInteger.valueOf(10));
		}
		return reverse;

	}
}
