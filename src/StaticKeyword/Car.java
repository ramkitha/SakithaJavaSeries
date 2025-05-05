package StaticKeyword;

public class Car {
	
	//1. instance variables
	String name;
	int price;
	String LicenceNumber;
	
	
	// 2. static variables: will never be part of the object
	//JVM will create only one common copy for the static variable
	//CMA: Common Memory Allocation
	static final int wheels = 4; // final is used for constant. we cannot change to assign different value in later
	//static variable is only allowed for class variable. not local variable
	//final can be used for class variable and local variable
	
	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.LicenceNumber = "US121212";
		
		//how to access static variables
		//1. use it directly
		System.out.println(wheels);
		
		//2.using it by class name
		System.out.println(Car.wheels);
		
		//how to access non static variables? using object reference name
		System.out.println(c1.name);
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.LicenceNumber = "IND121212";
		
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.LicenceNumber = "HONDA21212";
		
		
		
		
		
		

	}

}
