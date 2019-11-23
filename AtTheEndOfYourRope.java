import java.util.Scanner;
import java.lang.Math;
public class AtTheEndOfYourRope {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean repeat = false;
		
		while (repeat == false) {
			int radius = scan.nextInt();
			if (radius <= 100 && radius >= 0) {
				
				double area = Math.PI * radius * radius;
				System.out.println(area);
				
				repeat = true;
			}
			else {
				System.out.println("Please enter a postive integer below 100");
				repeat = false;
			}
		}
		
		scan.close();
		
	}
}
