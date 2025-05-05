package SakiJavaPractice;

public class LoopConcept {

	public static void main(String[] args) {
		// print 1 to 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int a = 1;
		while (a < 10) {
			System.out.println(a);
		a = a + 2;
		}
		
		System.out.println("---------------------");
		
		int p=1;
		while (p<=10) {
			System.out.println(p);
			if (p==5) {
				System.out.println("Hello selenium");
				break;//this break will break entire loop
			}
			p++;
		}
		
		System.out.println("---------------------");
		
		//printing even number
		int b =1;
		while (b<=10) {
			if(b % 2 ==0) {
			System.out.println(b);
			
		}
			b++;
		}
		
		System.out.println("**************");
		//for loop
		//for(variable initialization; condition; incremental/decremental)
		for (int j = 0; j <= 10; j++) {
			System.out.println(j);
			
		}
		System.out.println("============");
		//printing even number
		for (int k = 0; k <= 10; ) {
			System.out.println(k);
			k=k+2;
		}
		System.out.println("============");
		//printing reverse order
		for(int x=10; x>=0; x--) {
			System.out.println(x);
		}
		
		System.out.println("============");
		//printing reverse order
		for(int num=10; num>=0; ) {
			System.out.println(num);
			num=num-2;
		}
		System.out.println("============");
		for (char m = 'a'; m <= 'z'; m++) {
			System.out.println(m + " " + (int)m);
			
		}
		
		//Do while looop
		
		int j = 1;
		do {
			System.out.println(" saki " +j );
			j++;
		}
		while(j>=10); //Will print once, since condition is not satisfied
		
	}

}
