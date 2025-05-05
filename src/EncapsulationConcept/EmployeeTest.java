package EncapsulationConcept;

public class EmployeeTest {

	public static void main(String[] args) {
		//instead of setters if we use constructor when we update it will create new object. that is not correct
		Employee e1= new Employee("Bala", 30, 12.33, false);
	//	e1.setName("Tom");
	//	e1.setAge(10);
	//	e1.setSalary(12.33);
	//	e1.setActive(true);
		
				
	
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.isActive());

	}

}
