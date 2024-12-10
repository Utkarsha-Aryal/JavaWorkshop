package week3;

public class Qn2W3 {
	public static void main(String[] args) {
		Car c = new Car();
		c.setModel("BMW");
		c.setPrice(20000);
		System.out.print("The model of the car "+c.getModel() +" the price is "+ c.getPrice() +"The fuel level is "+c.getfuelLevel());
	}

}

class Car{
	private String model;
	private double price;
	private int fuelLevel = 200;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}	
	
	public int getfuelLevel(){
		return this.fuelLevel;
	}
}