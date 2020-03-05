import java.util.Scanner;
public class WillYouMakeIt {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split(" ");
		
		Double[] numbers = new Double[array.length];
		for (int i = 0; i < array.length; i++) {
			numbers[i] = Double.parseDouble(array[i]);
		}
		
		double onTime = numbers[1] / numbers[2];
		
		System.out.println(onTime);
		
		if (onTime <= numbers[0]) {
			System.out.println( input + ". I will make it");
		}
		else {
			System.out.println( input + ". I will be late");
		}
		
		scan.close();
	}

}
