
public class VariableTest {
	public int num;                //�ν��Ͻ����� : ������ ��ü���� ������ ���� ����.
	public final int PORT=5000;    //��� : �ݵ�� �ʱ�ȭ�� �ʼ�. ������ �Ұ���
	public static int snum;        //Ŭ�������� : �޸𸮿� �ϳ��� ����.
	
		
	public static void main(String[] args) {
		VariableTest test = new VariableTest();  
//		System.out.println(test.num);
//		System.out.println(test.PORT);
//		System.out.println(test.snum);
//		test.PORT = 3000;
//		test.num = 50;
//		System.out.println(test.num);
//		VariableTest test2 = new VariableTest();
//		
//		test2.num = 100;
//		System.out.println(test2.num);
		test.snum = 50;
		System.out.println(snum);
		VariableTest.snum = 100;
		System.out.println(VariableTest.snum);
		test = new VariableTest();
		System.out.println(test.snum);
		snum *= 2;
		System.out.println(snum);
		System.out.println((VariableTest.snum));
		System.out.println(test.snum);
	}
		

}
