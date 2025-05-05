package EncapsulationConcept;

public class Employee {

	/// POJO-Plain Old Java Object.- class has public constructor and public
	/// encapsulation and private members
	// should not extend and implements
	// should not have any annotations @

	private String name;
	private int age;
	private double salary;
	private boolean isActive;

	// constructor



	public Employee(String name, int age, double salary, boolean isActive) {
		{
			if (name.length() != 0) {
				this.name = name;
				this.name = name;
			} else {

				System.out.println("Name cannot be blank");
			}
		}

		{
			if (age >= 18) {
				this.age = age;
			} else {
				System.out.println("Age should be greater or equals to 18");
			}
		}
		this.salary = salary;
		this.isActive = isActive;
	}

	// public getter and setter

	public String getName() {

		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
