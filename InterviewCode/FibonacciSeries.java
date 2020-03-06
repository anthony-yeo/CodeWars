
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		// BigInteger result = fibonacciRecursion(n); // it takes more time if n >= 35
		 BigInteger result = fibonacciNoRecursion(n);
		System.out.println(result);
	}

	/*
	 * using recursion to calculate fibonacci number is great, but it takes time
	 * when x getting bigger (try x = 40)
	 */
	public static BigInteger fibonacciRecursion(int x) {
		switch (x) {
		case 0:
			return BigInteger.ZERO;
		case 1:
			return BigInteger.ONE;
		default:
			return fibonacciRecursion(x - 1).add(fibonacciRecursion(x - 2));
		}
	}

	public static BigInteger fibonacciNoRecursion(int x) {
		if (x == 0 || x == 1) {
			return BigInteger.valueOf(x);
		} else {
			BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
			BigInteger r = BigInteger.ZERO;
			for (int i = 2; i <= x; i++) {
				r = a.add(b);
				a = b;
				b = r;
			}
			return r;
		}
	}
}
