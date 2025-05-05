package JavaSessions;

public class NestedLoops {

	public static void main(String[] args) {
		//00,01,02,03,04,05
		//10,111,12,13,14,15
		//20,21,22,23,24,25
		//
		//
		//50,51,52,53,54,55
		
		
		for (int i=0; i<=5; i++) {
			for(int j = 0; j<=5; j++) {
				System.out.print(i+""+j + " ");
			}
			System.out.println();
		}
		for (int x=0; x<=9; x++) {
			for(int y = 0; y<=9; y++) {
				for (int z =0; z<=9; z++) {
				System.out.print(x+""+y +z + "  ");
				}
			
			}
			System.out.println();
		}
		
		
	}

}
