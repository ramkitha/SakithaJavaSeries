package JavaSessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//array:static Array
		//1. new keyword
		//2. array literals
		
		
		//int array
		int i[] = new int[4];//0 to 3, li=0, hi=3, length=4
		i[0] = 100;
		i[1]= 200;
		i[2]= 300;
		i[3]= 400;
		//i[4]= 500;//AIOB because length of Array is 4, so 5th element is giving error. Run time error
		
		System.out.println(i[0]);//100
		System.out.println(i[3]);//400
		//System.out.println(i[5]);// Array IndesOutOfBoundsException: AIOB
		
		System.out.println(i.length); //Array length. 4
		
		
		int p[] = new int[4];
		p[0] = 10;
		p[2] = 20;
		p[3] = 30;
		System.out.println(p[1]);// we didn't initiate p[1], so storing 0
		System.out.println(Arrays.toString(p));
		
		
		int price[] = new int[4];
		price[0]= 100;
		price [1]=200;
		price [2]= 300;
		price[3]=400;
		System.out.println(Arrays.toString(p));
		// print all the vales of the array
		System.out.println(Arrays.toString(price));// use only for the printing purpose
		
		for(int k=0; k<price.length ; k++) {
			System.out.println(price[k]);
		}
		
		// double Array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.44;
		System.out.println(Arrays.toString(d));
		
		//char array
		char ch[] = new char[3];
		ch[0]='a';
		ch[1]='A';
		ch[2]='$';
		System.out.println(Arrays.toString(ch));
		
		
		//boolean
		boolean fg[]= new boolean[2];
		System.out.println(Arrays.toString(fg));
		fg[0] = true;
		fg[1] = false;
		
		System.out.println(Arrays.toString(fg));
		
// default values
		// int, short, long, byte: 0
		//double, float:0.0
		//boolean: false
		//char:space
		
	}

}
