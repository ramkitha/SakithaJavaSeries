package StaticMethod;

public class Employee {
	
	
	
	
	public void sendMail() {
		System.out.println("Send mail");
	}

	
	public static void readMail() {
		System.out.println("Read mail");
	}
	
	
	
	public static void main(String[] args) {
	//1. calling nonstatic method:create the object of the class
		
		Employee e = new Employee();
		e.sendMail();
		
		//access static method
		//a. call directly
		readMail();
		
		//b. using class name - Recommended way
		Employee.readMail();
		
		//c. use reference variable - not recommended
		e.readMail();  //giving warning
		
		

	}

}
