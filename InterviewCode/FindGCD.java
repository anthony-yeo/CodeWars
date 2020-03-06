

import java.math.BigInteger;
import java.util.Scanner;

public class FindGCD {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		in.close();
		System.out.println("GCD of " + a + " and " + b + " is : " + finDGCD(a, b));
	}

	public static BigInteger findGCD(BigInteger a, BigInteger b) {
		return a.compareTo(BigInteger.ZERO) == 0 ? b : b.compareTo(BigInteger.ZERO) == 0 ? a : findGCD(b, a.mod(b));
	}

	public static BigInteger finDGCD(BigInteger a, BigInteger b) {
		if (a.compareTo(BigInteger.ZERO) == 0)
			return b;

		if (b.compareTo(BigInteger.ZERO) == 0)
			return a;

		while (b.compareTo(BigInteger.ZERO) != 0) {
			if (a.compareTo(b) == 1)
				a = a.subtract(b);
			else
				b = b.subtract(a);
		}
		return a;
	}

}
