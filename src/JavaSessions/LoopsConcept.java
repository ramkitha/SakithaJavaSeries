package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. While loop:
		// print 1 to 10
		
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
			//++i;// print 1 to 10
			i++; //print 1 to 10
			
		}
		
		
		
		for (int ch='a'; ch<='z'; ch++) {
			System.out.println(ch +" = "+ ch);
		}

		System.out.println("--------------------");
		
		for (char ch='a'; ch<='z'; ch++) {
			System.out.println(ch +" = "+ (int)ch);
		}
		
		
		for ( int k=1; k<=10; k++) {
			System.out.println("Bye");
		}

	}

}
