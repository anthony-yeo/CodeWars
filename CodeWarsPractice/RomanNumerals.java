import java.util.Scanner;
public class RomanNumerals {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an number: ");
		int number = scan.nextInt();
		String roman = "";
		
		if (number == 100) {
			roman += "C";
			System.out.println("The roman numeral for " + number + "is " + roman);
		}
		else if (number == 50) {
			roman += "L";
			System.out.println("The roman numeral for " + number + "is " + roman);
		}
		else if (number == 10) {
			roman += "X";
			System.out.println("The roman numeral for " + number + "is " + roman);
		}
		else if (number == 0) {
			System.exit(0);
		}
		
		if (number < 100 && number > 89) {
			roman += "XC";
			number = number - 90;
			if (number == 9) {
				roman += "IX";
			}
			else if (number == 8) {
				roman += "VIII";
			}
			else if (number == 7) {
				roman += "VII";
			}
			else if (number == 6) {
				roman += "VI";
			}
			else if (number == 5) {
				roman += "V";
			}
			else if (number == 3) {
				roman += "III";
			}
			else if (number == 2) {
				roman += "II";
			}
			else if (number == 1) {
				roman += "I";
			}
			
		}
		else if (number < 90 && number > 59) {
			roman += "L";
			number = number - 50;
			if (number > 29) {
				number = number - 30;
				roman += "XXX";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
			else if (number > 19) {
				number = number - 20;
				roman += "XX";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
			else if (number > 9) {
				number = number - 10;
				roman += "X";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
			else if (number > 0) {
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}	
		}
		else if (number > 10 && number < 50) {
			if (number > 39) {
				number = number - 40;
				roman += "XL";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
			else if (number > 29) {
				number = number - 30;
				roman += "XXX";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
			else if (number > 19) {
				number = number - 20;
				roman += "XX";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
				
			}
			else if (number > 9) {
				number = number - 10;
				roman += "X";
				if (number == 9) {
					roman += "IX";
				}
				else if (number == 8) {
					roman += "VIII";
				}
				else if (number == 7) {
					roman += "VII";
				}
				else if (number == 6) {
					roman += "VI";
				}
				else if (number == 5) {
					roman += "V";
				}
				else if (number == 3) {
					roman += "III";
				}
				else if (number == 2) {
					roman += "II";
				}
				else if (number == 1) {
					roman += "I";
				}
			}
		}
		else if (number > 0 && number < 10) {
			if (number == 9) {
				roman += "IX";
			}
			else if (number == 8) {
				roman += "VIII";
			}
			else if (number == 7) {
				roman += "VII";
			}
			else if (number == 6) {
				roman += "VI";
			}
			else if (number == 5) {
				roman += "V";
			}
			else if (number == 3) {
				roman += "III";
			}
			else if (number == 2) {
				roman += "II";
			}
			else if (number == 1) {
				roman += "I";
			}
		}
		System.out.println(roman);
		scan.close();
	}
}
