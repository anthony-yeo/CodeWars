import java.util.Scanner;
public class ReaumurTemperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Reaumer temperatures: ");
		double reaumur = scan.nextDouble();
		
		double f = reaumur * 2.25 + 32;
		System.out.println( f + " degrees Fahrenheit");
		scan.close();
	}
}
