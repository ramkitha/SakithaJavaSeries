package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "ie";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		case "edge":
			System.out.println("launch edge");
			break;

		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("invalid browser");
			break;
			
		case "ie":
			System.out.println("launch ie");
			break;

		}
		int number =10;
		switch (number) {
		case 10:
			System.out.println(10);
			break;

		default:
			System.out.println();
			break;
		}

		char alpha ='a';
		switch (alpha) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonent");
			break;
		}
		
		char alpha1 ='A';
		switch (String.valueOf(alpha1).toLowerCase()) {
		case "a":
			System.out.println(alpha1 + " is a vowel");
			break;
		case "e":
			System.out.println(alpha1 + " is a vowel");
			break;
		case "i":
			System.out.println(alpha1 + " is a vowel");
			break;
		case "o":
			System.out.println(alpha1 + " is a vowel");
			break;
		case "u":
			System.out.println(alpha1 + " is a vowel");
			break;
		default:
			System.out.println(alpha + " is a consonent");
			break;
		}
		// this will be performance issue, will check all cases because of no break
		char top = 'a';
		switch (top) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(top + " is a vowel");
			break;

		default:
			System.out.println(top + " is a consonent");
			break;
		}
		
		
		
		
	}

}
