package week3;
import java.util.Scanner;

/*Create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
Then create two classes Car and Motorcycle that extend Vehicle and implement these methods differently.
*/

public class Qn3W3 {
	public static void main(String[] args) {	
		Auto C = new Auto();
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter the name of the car brand ");
		String CBrand = input.nextLine();
		C.startEngine(CBrand);
		C.stopEngine(CBrand);
		
		
				
	}


}

abstract class Vehicle{
	public abstract void startEngine(String brand);
	
	public abstract void stopEngine(String brand);
}

// Auto is synonym of car 
 class Auto extends Vehicle{
	@Override
	public void startEngine(String brand) {
		System.out.println("The car of the brand "+brand+" is started");
		
	}
	@Override
	public void stopEngine(String brand) {
		System.out.println("The Car of the brand "+brand+" is stopped");

		
	}
} 


 class Motorcycle extends Vehicle{
	@Override
	public void startEngine(String brand) {
		System.out.println("The motercycle of the brand "+brand+" is started");
		
	}
	@Override
	public void stopEngine(String brand) {
		System.out.println("The motercycle of the brand "+brand+" is stopped");

		
	
	
} 
}
