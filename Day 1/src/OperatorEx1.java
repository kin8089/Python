
public class OperatorEx1 {

	public static void main(String[] args) {
		int num = 3;
		//num  = -num;
		//System.out.println(~num);
		int a = ++num ;  //�������� : ������ ��ó��
		System.out.println("num="+num+","+"a="+a);
		a = num++;       //�������� : ��ó�� ������ - ����ϰ� ���� ���� ������
		System.out.println("num="+num+","+"a="+a);
		
		int x=3, y=3 ;
		a = ++x + ++y;     // ++ = +1 , -- = -1
		System.out.println("x="+x+","+"y="+y+"a="+a);
		a = x++ + ++y;
		System.out.println("x="+x+","+"y="+y+"a="+a);
		
		
		boolean flag = false;
		System.out.println(!flag);  //! = not������
		
		
	}

}
