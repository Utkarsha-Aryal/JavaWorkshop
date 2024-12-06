package tutorial2;

public class MathodOverloading {
	static void area(double r) {
		System.out.println("Area of circle: "+Math.PI *r*r);
	}
	static void area(int l) {
		System.out.println("Area of square: "+(l*l));
	}
	static void area(double l ,double b) {
		System.out.println("Area of rectangle "+ (l*b));
	}
	
	public static void main (String[] args) {
		area(5,6);
		area(5.0);
		area(5);
	}

}
