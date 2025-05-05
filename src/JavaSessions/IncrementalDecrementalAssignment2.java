package JavaSessions;

public class IncrementalDecrementalAssignment2 {

	public static void main(String[] args) {

		// 8) What is wrong with the below program? Why it is showing a compilation
		// error?

		// int I = 11;

		// int j = --(i++); //1. we cannot use both -- and ++ at the same time.
		// 2. upper case and lower case i. (Initiated the variable uppercase I.
		// operation with lower case i. both are not same)

		// 9) Guess the value of p in the below program?

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;
		System.out.println(p);// 1

		// 10) What will be the output of the following program?

		int a = 1;
		a = a++ + ++a * --a - a--;
		System.out.println(a);// 5

		// 11) What will be the outcome of the below program?

		// int y = 11++;//these operations can be on variables, not for the numbers

		//System.out.println(y);

		//12.12) What will be the outcome of the below program?
		int ch = 'A';//65
		System.out.println(ch++);//65
		
		//13) What will be the outcome of the below program?
	     
		char ch1 = 'A';

	     System.out.println(++ch1);//B
	     
	     
	     //14) What will be the outcome of the below program?
	    double d = 1.5, D = 2.5;

	     System.out.println(d++ + ++D);//5.0
		
	}

}
