import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
//		System.out.println(Math.random());
//		0<= ���� <1
		System.out.println((int)(Math.random()*100+1));           // ��°�� ������� ���ϴ� ���� int�� ��ȯ
		
		Random random = new Random();
		System.out.println(random.nextInt(100)+1);                // 0~99������ �������̱� ������ +1����
		
	}

}
