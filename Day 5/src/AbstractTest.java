abstract class Animal{
	int arms = 2;
	public abstract void move() ; 
	
}
class Dog extends Animal{
	public void move() {
		System.out.println("�Ȱ�, �ٰ�, �� �� ����");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
//			Animal animal = new Animal();
			Animal a = new Dog();    //������ ��ü
			a.move();
	}

}
