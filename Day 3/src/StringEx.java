
public class StringEx {

	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.print(a==b);
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = ("java");
		String s4 = ("java");
		System.out.print(s1==s2);             //heap�޸𸮿� ������ ��ü�� ����, �� ��ü�� �ּҰ��� �ٸ�
		System.out.print(s1==s3);             //heap�޸𸮿� string pool�޸𸮿� ������ ��ü�� �ּҰ� �ٸ�
		System.out.print(s3==s4);	 		  //string pool�� �Է¹��� ���� ������ ���� ����. �̹� �Է°��� �����ϸ� ���� �ּҰ��� ����.
		
	}

}
