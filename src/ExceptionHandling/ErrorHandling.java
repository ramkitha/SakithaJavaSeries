package ExceptionHandling;

public class ErrorHandling {

	
	
	public static void test () {
		test();
	}
	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			//int i =9/0;//AE
			test();//stack overflow. its handled by catch block
		}
		catch(Throwable e) {
			System.out.println("some error is coming");
			e.printStackTrace();
		}
System.out.println("bye");

		
		
		
		

	}

}
