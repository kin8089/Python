import java.util.Scanner;
public class Quiz6 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.print("주민번호 입력(ex)XXXXXX-XXXXXXX==>");
        String strJumin= input.read();
         int digit = 2, sum = 0;
         for (int i=0;i<strJumin.length()-1;i++){
              if(i==6) continue;
              if(digit == 10) digit=2;
              sum +=  (str.charAt(i)-48)*digit;             //아스키코드 48 = 0
	 digit++;
         }
          int result=(11-sum%11)%10;
          if(result ==(str.charAt(13)-'0'){
              System.out.println("\n CORRECT");
          }else{
 	  System.out.println("\n INCORRECT");
          }
  }//main end
}//class end
