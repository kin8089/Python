public class Calc {
	public int calculate(int n1, int n2 , String op) {
		int result =0;
			switch(op) {
			case "+" : result = (n1+n2) ; break;
			case "-" : result = (n1-n2) ; break;
			case "*" : result = (n1*n2) ; break;
			case "/" : result = (n1/n2) ; break;
			case "%" : result = (n1%n2) ; break;
			
			default :
				result = -1;
			}
		return result;
	}
	
	
	public void squarePower(int n1, int n2) {
		System.out.println(Math.pow(n1, n2));
	}
}