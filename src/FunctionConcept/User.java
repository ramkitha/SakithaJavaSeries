package FunctionConcept;

public class User {

	
	//function/method - non static - data member of the class
	
			//function will have its own body in the class
			//can not create a function inside another function
	        // but I can call the function inside the function
			//function can return single value
			
	//1.no input and no return
		public void test() {
		
		System.out.println(" test method ");
	}
		public void click() {
			System.out.println("click on button");
			return; //blank return
		}
		
	//2. no input but some return
		public int add() {
			System.out.println("add method");
			
			int a=100;
			int b= 200;
			int c= a+b;
			return c;
		}
		
		public String getTrainnerName() {
			String name = "Tom";
			return name;
		}
		//3. some input and some return
		public int sum (int a, int b) {
			int z=a+b;
			return z;
		}
		
		public double getFinalBillAmount (double foodBill, double drinkBill, double tax) {
			System.out.println("calculating the final bill");
			double finalBill = foodBill + drinkBill +tax;
			return finalBill;
		}
	
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.test();
		int s1 = u1.add();
		System.out.println(s1);
		
		String n1=u1.getTrainnerName();
		
		if (n1.equals("Naveen")) {
			System.out.println("I will join the class");
		}else {
			System.out.println("I won't join the class");
		}
		
		int t1 = u1.sum(10, 20);//calling function by passing two arguments/call by value
		System.out.println(t1);
		int t2 = u1.sum(20,  -5);
		System.out.println(t2);
		double amt = u1.getFinalBillAmount(200.12,  56.66,  3.2);
		System.out.println(amt-20);
		
	}

}
