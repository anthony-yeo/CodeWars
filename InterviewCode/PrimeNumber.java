
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Number, " + n + ", is " + (isPrime(n) ? "prime" : "not prime"));
	}

	public static boolean isPrime(int x) {
		if (x == 0 || x == 1)
			return false;
		if (x == 2 || x == 3)
			return true;

		if (x % 2 == 0)
			return false;

		int sqrt = (int) Math.sqrt(x) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;

	}
}
