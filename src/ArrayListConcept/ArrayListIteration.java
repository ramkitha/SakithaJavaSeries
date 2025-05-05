package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);
		
		System.out.println(marksList);
		
		for(int i = 0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
			
		}
		
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		
		
		
	}

}
