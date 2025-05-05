package SakiJavaPractice;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {
				
				System.out.print(i + "" + j + " ");
			}
			System.out.println("");
		}
		System.out.println("=========================");
		for (int x = 0; x <= 5; x++) {

			for (int y = 0; y <= 5; y++) {
				for(int z=0; z<=5;z++) {
				
				System.out.print(x + "" + y +z+ " ");
			}
			
		
			System.out.println("");
			
		}
			System.out.println("");

	}}}
	
	

