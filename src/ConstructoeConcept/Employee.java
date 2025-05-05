package ConstructoeConcept;

public class Employee {

			// constructor
			//having same name as class name
			//will be called when you create the object
			//is not a function
			//cannot return anything
			//cannot be void. There is no return type
			//can be overloaded
	
	public Employee() {
		System.out.println("default 0 param const");
	}
	
	
	public Employee(int i) {
		System.out.println("1 param const.");
	}
	
	public Employee(int i, String s) {
		System.out.println("2 param const.");
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10);//
		Employee e2 = new Employee();  // default const called
		Employee e3 = new Employee (100, "selenium");
		
		
		
	}

}
