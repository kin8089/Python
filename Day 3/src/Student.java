
public class Student {
    public String sno ;   //�й�
    public String name;
    public int kor;
    public int math;
    public int eng;
    public Student(String sno, String name, int kor, int math,int eng ) {
    	this.sno = sno;
    	this.name = name;
    	this.kor = kor;
    	this.math = math;
    	this.eng = eng;
    }
   
    //���� ������ �����ϴ� �޼���
    public int  getTotal() {
          return  kor+math+eng;
    }

    //���� ����� ����ϴ� �޼���
    public void printAverage(){
         System.out.println(getTotal()/3);
     }
} 