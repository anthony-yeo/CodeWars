import java.util.Scanner;
import java.util.ArrayList;
public class FortuneTeller {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String cat = scan.nextLine();
		int options = Integer.parseInt(cat);
		
		String cat1 = "";
		String cat2 = "";
		String cat3 = "";
		String cat4 = "";
		
		String result1 = "";
		String result2 = "";
		String result3 = "";
		String result4 = "";
			
		
		
		options++;
		
		ArrayList<String> array1 = new ArrayList<String>();
		ArrayList<String> array2 = new ArrayList<String>();
		ArrayList<String> array3 = new ArrayList<String>();
		ArrayList<String> array4 = new ArrayList<String>();
		
		System.out.println("Category 1");
		
		for (int i = 0; i < options; i++) {
			array1.add(scan.nextLine());
		}
		
		System.out.println("Category 2");
		
		for (int i = 0; i < options; i++) {
			array2.add(scan.nextLine());
		}
		
		System.out.println("Category 3");
		
		for (int i = 0; i < options; i++) {
			array3.add(scan.nextLine());
		}
		
		System.out.println("Category 4");
		
		for (int i = 0; i < options; i++) {
			array4.add(scan.nextLine());
		}
	
		String[] magic = new String[2];
		for (int i = 0; i < 2; i++) {
			magic[i] = scan.nextLine();
		}
		
		boolean fix = true;
		int loop = Integer.parseInt(magic[1]);
		
		
		if(fix) {
			options--;
			
			//array1
			for (int j = 0; j < options - 1; j++) {
				if (loop < options) {
					array1.remove(loop + j);
				}
				else if (loop == options) {
					array1.remove(loop - 1);
				}
				else if(loop > options) {
					int x = loop % options;
					array1.remove(x);
				}
				options--;
			}
			
			cat1 = array1.get(0);
			result1 = array1.get(1);	
		}
		
		
		if(fix) {
			options--;
			
			//array3
			for (int j = 0; j < options - 1; j++) {
				if (loop < options) {
					array3.remove(loop + j);
				}
				else if (loop == options) {
					array3.remove(loop - 1);
				}
				else if(loop > options) {
					int x = loop % options;
					array3.remove(x);
				}
				options--;
			}
		
			cat3 = array3.get(0);
			result3 = array3.get(1);
		}
		
		if(fix) {
			//aray2
			options--;
			for (int j = 0; j < options - 1; j++) {
				if (loop < options) {
					array2.remove(loop + j);
				}
				else if (loop == options - 1) {
					array2.remove(loop);
				}
				else if(loop > options) {
					int x = loop % options;
					array2.remove(x);
				}
				options--;
			}
			
			cat2 = array2.get(0);
			result2 = array2.get(1);
		}
		
		
		if(fix) {
			//array4
			options--;
			for (int j = 0; j < options - 1; j++) {
				if (loop < options) {
					array4.remove(loop + j);
				}
				else if (loop == options) {
					array4.remove(loop - 1);
				}
				else if(loop > options) {
					int x = loop % options;
					array4.remove(x);
				}
				options--;
			}
			
			cat4 = array4.get(0);
			result4 = array4.get(1);
		}
		
		System.out.println("Your MASH Story: ");
		System.out.println(cat1 + " - " + result1);
		System.out.println(cat2 + " - " + result2);
		System.out.println(cat3 + " - " + result3);
		System.out.println(cat4 + " - " + result4);
		
		scan.close();
	}
}
