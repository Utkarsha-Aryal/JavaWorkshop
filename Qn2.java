package workshop1;

class Shape {
	public void getPerimeter(int r) {
		System.out.println("This is from superclass");
		
	}
	public void getArea(int r) {
		System.out.println("This is from superclass");
	}
}

class Circle extends Shape{
	@Override
	public void getPerimeter(int r) {
		double c = 2*Math.PI*r;
		System.out.println("THis is the perimeter of the circle "+c);
	}
	public void getArea(int r) {
		double A = Math.PI*Math.pow(r, 2);
		System.out.println("This is the area of the circle "+A);
		
	}
	
	
}





public class Qn2 {
	public static void main(String[] args) {
		Circle ram = new Circle();
		ram.getPerimeter(5);
		ram.getArea(4);
		
	}

}
