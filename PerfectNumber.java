import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive interger");
		int number = scan.nextInt();
		
		int sum = 0;
		for (int i = 2; i <= number; i++) {
			
			if (number % i == 0) {
				System.out.print(i + ":");
				System.out.println(number/i);
				sum = sum + (number/i);
			}
		}
		
		
		if(sum == number) {
			System.out.println(number + " IS perfect");
		}
		
		else if(sum != number) {
			System.out.println(number + " IS NOT perfect");
		}
		scan.close();
	}
}
