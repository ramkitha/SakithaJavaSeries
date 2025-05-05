package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(); // default vertual capacity of arraylist is 10
		System.out.println(ar.size());//0
		System.out.println(ar);
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);
		System.out.println(ar.size());//3
		
		
		ar.add(400)
;
		ar.add(500);
		System.out.println(ar.size());//5
		System.out.println(ar);
		
		ar.remove(3);
		System.out.println(ar.size());//4
		System.out.println(ar.get(3));
		
		System.out.println(ar);
		
		
		ArrayList<Integer> tr = new ArrayList<Integer>(5);
		
		

		//System.out.println(tr.get(2)); //IOB
		//	tr.add(3, 30);//IOB
		tr.add(10);
		tr.add(20);
		tr.add(30);
		tr.add(40);
		tr.add(50);
		System.out.println(tr);
		
		tr.add(1,25);
		System.out.println(tr);//it will push all data down and add 25 in 1st index
		
		tr.set(1, 30);//will replace 30 in 1st index 
		System.out.println(tr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
