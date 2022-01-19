
public class MethodEx {
	private int num;                 //멤버변수
 	public void setNum(int num) {    //매개변수 num = 로컬변수
		//값의 유효성 검사 코드
 		//로컬변수와 멤버변수간의 이름 충돌이 발생 시 멤버변수 앞에 클래스로부터 생성된 객체 자신을 의미하는 참조변수를 사용 / 파이썬 self = this
 		this.num = num;
	}

 	public int getNum() {
 		return num;
 	}




}


