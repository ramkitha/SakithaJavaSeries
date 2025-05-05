package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		//++ and --
		
		//1. post increment
		
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		
		int v=-56;
		int w = v++;
		System.out.println(v); //-55
		System.out.println(w); //-56
		
		
		int x =10;
		System.out.println(x++);//10
		System.out.println(x);//11
		
		
		//2. Pre increment
		
		int s=1;
		int q = ++s;
		System.out.println(s);// 2
		System.out.println(q);//2
		
		int t1=-99;
		int t2= ++t1;
		System.out.println(t1);// -98
		System.out.println(t2);//-98
		
		//3. post decrement
		
		int p =2;
		int p2 =p--;
		System.out.println(p);//1
		System.out.println(p2);//2
		
		
		int f1 =-999;
		int f2= f1--;
		System.out.println(f1);// -1000
		System.out.println(f2);//-999
		
		
		//4. pre decrement
		int a1 = 2;//1
		int a2=--a1;//1
		
		int total = 100;
		
		System.out.println(++total);//101
		System.out.println(total);//101
		
		int num = -50;
				System.out.println(num);//-50
		System.out.println(--num);//-51
		System.out.println(num);//-51
		
		double d1=1.1;
		double d2=d1++;
		System.out.println(d1);//2.1
		System.out.println(d2);//1.1
		
		
		char ch='a';
		char bh = ch++;
		System.out.println(ch);//b
		System.out.println(bh);//a
		
		
		int nm=10;
		int um =nm+3;
		System.out.println(nm);//10
		System.out.println(um);//13
		
		
		
				
		
		
		
		
		
		

	}

}
