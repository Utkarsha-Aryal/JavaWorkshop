package week3;
/* Create an abstract class GameCharacter with abstract methods like attack() and defend().
   Then, create subclasses Warrior and Archer with different attack and defense behaviors.
*/

abstract class GameCharacter{
	public abstract   void attack();
	
	public abstract   void defense();

	
}

class Warrior extends GameCharacter{
	@Override
	public  void attack() {
		System.out.println("THe warrior attacks with sword");

	}
	
	@Override
	public    void defense() {
		System.out.println("THe warrior defends with shield");

	}

}

class Archer extends GameCharacter{
	@Override
	public  void attack() {
		System.out.println("THe archer attacks with bow and arrow");
		
	}
	
	@Override
	public   void defense() {
		System.out.println("THe archer defends behind thwe wall ");
	
	}

}


public class Qn4W3 {
	public static  void main(String[] args) {
		Warrior W = new Warrior();
		W.attack();
		
		Archer A = new Archer();
		A.attack();

		
	}
	

}
