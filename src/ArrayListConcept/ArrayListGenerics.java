package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<Comparable> ar = new ArrayList<Comparable>();
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		ar.add('c');
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10,pc=o
		marksList.add(100);
		
		ArrayList<Double>bmiList = new ArrayList<Double>();	
		bmiList.add(12.33);
		
		
		ArrayList<String>browserList = new ArrayList<String>();	
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		
		
		System.out.println(browserList);
		
		System.out.println(browserList.get(0));
		
		for(String e : browserList) {
			if(e.equals("edge")) {
				System.out.println("launch edge");
				break;
			}
		}
		
		
		
		ArrayList<Object>empData= new ArrayList<Object>();
		empData.add("Jaya");
		empData.add(30);
		empData.add(34.55);
		empData.add("SDET");
		empData.add('f');
		empData.add("Pune");
		empData.add(true);
		
		for (Object e : empData) {
			System.out.println(e);
			if(e.equals("SDET")) {
				System.out.println("increase salary by 10%");
				break;
			}
		}
		
		

	}

}
