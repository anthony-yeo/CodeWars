

import java.math.BigDecimal;
import java.util.Scanner;

public class FindSquareRoot {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		BigDecimal x = in.nextBigDecimal();
		in.close();
		System.out.println("Square Root of " + x + " is : " + findSqrt(x));
	}

	public static BigDecimal findSqrt(BigDecimal x) {
		return BigDecimal.valueOf(Math.sqrt(x.doubleValue()));
	}
}
