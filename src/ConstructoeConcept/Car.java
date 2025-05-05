package ConstructoeConcept;


//const vs function





public class Car {
	String name;
	int price;
	String licenceNum;
	double mileage;
	boolean isAvailable;
	
	
	

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Car(String name, String licenceNum) {
		super();
		this.name = name;
		this.licenceNum = licenceNum;
	}



	public Car(String name, int price, String licenceNum) {
		super();
		this.name = name;
		this.price = price;
		this.licenceNum = licenceNum;
	}
	
	


	public Car(String name, int price, String licenceNum, double mileage, boolean isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.licenceNum = licenceNum;
		this.mileage = mileage;
		this.isAvailable = isAvailable;
	}


	public static void main(String[] args) {
	
		Car c1 = new Car("BMW" , 50);
		Car c2= new Car("Honda", "abc123");
		Car c3 = new Car("Hyundai", 030, "sdf222", 12.33, true);
		
		
	}

}
