package JavaSessions;

public class ArithMaticOperations {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
	System.out.println(a +b);
		System.out.println(a+b+ "test Data");
		System.out.println("test data" +a+b);
		
		double c=12.33;
		double d=12.44;
		
		String x="hello";
		String y= "world";
		
		
		char ch ='a';
		char th='b';
		
		System.out.println(ch+th);//97 +98 = 195 askii values for a and b
		
		char yh = 99; //c
		
		System.out.println(x+a+b);//hello1020
		System.out.println(a+b+x);//30hello executions happens from left to right
		
		System.out.println(x+y+c+d+a+b);//helloworld12.3312.441020
		System.out.println(a+b+c+d+x+y+a+b);//54.77helloworld1020
		
		System.out.println(a+b+yh);//129
		
		System.out.println(ch+th+yh);//294 = 97+98+99
		
		
	}

}
