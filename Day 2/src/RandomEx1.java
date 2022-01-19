import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
//		System.out.println(Math.random());
//		0<= 난수 <1
		System.out.println((int)(Math.random()*100+1));           // 통째로 묶어줘야 원하는 값이 int로 변환
		
		Random random = new Random();
		System.out.println(random.nextInt(100)+1);                // 0~99사이의 난수값이기 때문에 +1해줌
		
	}

}
