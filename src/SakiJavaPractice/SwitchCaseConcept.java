package SakiJavaPractice;

public class SwitchCaseConcept {
// recording 7
	//can be used for char, int, byte
	// cannot used for boolean, long, float, double
	public static void main(String[] args) {
		String browser = "edge";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome browser launched");
			break;
		case "firefox":
			System.out.println("firefox browser launched");
			break;
		case "edge":
			System.out.println("Edge browser launched");
			break;
		default:
			System.out.println("Please provide the valid browser");
			break;
		}
		
		char alpha = 'p'; // at compile time it will decide which case to execute
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
			System.out.println(alpha +" is a consonent");
			break;
		}
		
		
		char top = 'u'; // at compile time it will decide which case to execute
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
