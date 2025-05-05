package ConstructoeConcept;

public class User {
	String name;
	int age;
	double salary;
	String dob;
	
	
	//constructor is used to initialize the instance variables with the local veriables usng this key word
	//
	
	
	
	public User (String name, int age) {
		//Global = local
		this.name = name;
		this.age = age;
	}
	
		

	public static void main(String[] args) {
		User u1= new User("jaya", 30);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.name +" "+ u1.age + " "+ u1.salary +  " "+u1.dob);// salary and dob will give default value
	
	}

}
