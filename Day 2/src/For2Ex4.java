
public class For2Ex4 {

	public static void main(String[] args) {
		a1: //label
			for(int i=0;i<3;i++){
			a2 : //label
			   for(int j=0;j<3;j++){
			       if (j==1) break a1; 
			       System.out.println("i="+i+", j="+j);
			   }

	}

}
	
}
