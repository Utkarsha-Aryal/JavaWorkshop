package week3;

abstract class Employee{
	public abstract void calculateSalaray(int monthly , int hourly);

	public void getDetails() {
		System.out.println("Detail of the employee");
	}
}


class FullTimeEMployee extends Employee{
	public void display() {
		
	}
	@Override
	public void calculateSalaray(int monthly , int hourly) {
		System.out.println("the monthly salary is "+monthly );
		
	}
	
}

class PartTimeEmployee extends Employee{
public void display() {
		
	}
	@Override
	public void calculateSalaray(int monthly , int hourly) {
		int total = hourly *1000;
		
		System.out.println("the monthly salary is "+total );
	}
	
}


public class W3T2 {
	public static void main(String[] args) {
		
		FullTimeEMployee F = new FullTimeEMployee();
		F.calculateSalaray(10000,0);
		PartTimeEmployee P = new PartTimeEmployee();
		P.calculateSalaray(0,2000);
		
		
	}

}
