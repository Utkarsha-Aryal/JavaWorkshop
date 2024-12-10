package week3;
/*Create an interface PaymentMethod with a method processPayment(double amount). Implement it in classes Esewa and Khalti. 
*/
interface PaymentMethod{
	void processPayment(double amount);
	
}




public class Qn5W3 {
	public static void main(String[] args) {
		PaymentMethod E  = new Esewa();
		E.processPayment(1000.2);
		PaymentMethod K = new Khalti();
		K.processPayment(900.5);
		
	}

}

 class Esewa implements PaymentMethod{
	 @Override
	 public void processPayment(double amount) {
	        System.out.println("Processing payment of Rs. " + amount + " through eSewa.");
	 }
	
}
 
 class Khalti implements PaymentMethod{
	 @Override
	 public void processPayment(double amount) {
	        System.out.println("Processing payment of Rs. " + amount + " through khalti.");

	 }
	 
 }
