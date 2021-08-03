package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				print +=  s.charAt(s.length() - i - 1);
			}
		System.out.println(print);
		}, "hello");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			int counter = 0;
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				if (counter % 2 == 0) {
					String t = s.charAt(i) + "";
				 t =	t.toUpperCase();
					print += t;
					
				}else {
					String t = s.charAt(i) + "";
					t = t.toLowerCase();
					print += t;
				}
				counter++;
			}
			System.out.println(print);
			
		}, "builder" );
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String print = "";
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				print +=  s.charAt(i);
				counter ++;
				if (counter != s.length()) {
					print += ".";	
				}
				
			}
		System.out.println(print);
		}, "hello");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				s = s.replaceAll("a", "");
				s = s.replaceAll("e", "");
				s = s.replaceAll("i", "");
				s = s.replaceAll("o", "");
				s = s.replaceAll("u", "");
			}
			System.out.println(s);
		},"hello");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
