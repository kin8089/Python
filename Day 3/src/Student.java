
public class Student {
    public String sno ;   //학번
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
   
    //과목 총점을 리턴하는 메서드
    public int  getTotal() {
          return  kor+math+eng;
    }

    //과목 평균을 출력하는 메서드
    public void printAverage(){
         System.out.println(getTotal()/3);
     }
} 