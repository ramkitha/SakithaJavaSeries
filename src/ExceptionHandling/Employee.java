package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
		//int i = 9/0;//AE
		int p[] = new int[2];
				p[5]=100;//ArrayIndexOut of bound exception
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming ...");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming ...");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("NPE is coming ...");
			e.printStackTrace();
		}
		
		System.out.println("Bye");

	}

}
