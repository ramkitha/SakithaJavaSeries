package JavaSessions;

public class IncrementalDecrementalAssignment {

	public static void main(String[] args) {
		
		//1) What will be the output of the following program?
		//int i = 11;
		//i = i++ + ++i;

		//System.out.println(i);// 24
		
		//2) Guess the output of the following program?
		//int a=11, b = 22, c;
		//c=a+b+a++ + b++ + ++a + ++b;
		//System.out.println(c);//103
		
		
		//3) What will be the output of the below program?
		int x=0;
		
		x= x++ - --x + ++x -x--;
		System.out.println(x); // 0
		
		//4) Is the below program written correctly?
		boolean y = true;
		//y++; wrong Type mismatch
		
		
		//5) What will be the output of the below program?
		
		//int i=1, j=2, k=3;
		//int m=i-- -j-- - k--;
		
		//System.out.println("i="+i);//0

		//System.out.println("j="+j);//1

		//System.out.println("k="+k);//2

		//System.out.println("m="+m);//-4
		
		
		//6) What will be the output of the following program?
		
		int a=1, b=2;
		System.out.println(--b - ++a + ++b - --a);//0
		
		
		//7) What will be the value of i, j and k in the below program?
		
		int i=19, j=29, k=0;

		int m = i-- - j-- - k--;


		System.out.println("i="+i);//18

		System.out.println("j="+j);//28

		System.out.println("k="+k);//-1
		
		
		
		
	}

}
