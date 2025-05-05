package JavaSessions;

public class IfElseConcept {

	public static void main(String[] args) {

		// == comparison operator to compare 2 primitive data type
		// = assignment operator
		// to compare 2 Strings (non promitive) use .equals method

		int a = 10;
		int b = 20;

		if (a == b) {

			System.out.println("pass");
		} else {

			System.out.println("fail");
		}
		// because we pass the boolean directly else is going to be dead. never reach
		// else
		if (true) {

			System.out.println("pass");
		} else {

			System.out.println("fail");
		}

//always define the variable
		boolean flag = false;
		if (flag) {
			System.out.println("Hello");
		} else {
			System.out.println("bye");
		}

		// Nested if else
		int number = 70;
		if (number <= 100) {
			if (number >= 95) {
				System.out.println("Grade A");
				if (number == 100) {
					System.out.println("Grade A++");
					System.out.println("Eligible for MBA");
				}
			} else {
				if (number >= 75) {
					System.out.println("Grade B");
				} else {
					System.out.println("Grade C");
				}
			}
		} else
			System.out.println("Invalid marks");

		int p = 500;
		int q = 600;
		int r = 700;
		int s = 400;
		
		if (p> q && p > r && p> s) {
			System.out.println("p is greatest");
		}else {
			if (q >r && q>s) {
				System.out.println("q is greatest");
			} else {
				if (r >s) {
					System.out.println("r is greatest");
				}else {
					System.out.println("s is greatest");
				}
			}
		}
		
		
	}

}
