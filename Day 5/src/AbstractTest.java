abstract class Animal{
	int arms = 2;
	public abstract void move() ; 
	
}
class Dog extends Animal{
	public void move() {
		System.out.println("걷고, 뛰고, 기어갈 수 있음");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
//			Animal animal = new Animal();
			Animal a = new Dog();    //다형성 객체
			a.move();
	}

}
