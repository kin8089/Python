public class BankingTest {

	public static void main(String[] args) {
		 Account h_account = new Account(10000);
		 Customer hong = new Customer("0001", "홍길동");
		 hong.setAccount(h_account);
		 System.out.println(hong);
		 if (h_account.deposit(1000)) {
		    System.out.println("1000원 입금:입금성공");
		 }else {
			  System.out.println("1000원 입금:입금실패"); 
		  }
		 
		 System.out.println(hong.toString());
		 if (h_account.withdraw(5000)) {
			 System.out.println("5000원 출금:출금성공");
		  }else {
			  System.out.println("5000원 출금:출금실패"); 
		  }
		 System.out.println(hong );
		 if (h_account.withdraw(7000)) {
			 System.out.println("7000원 출금:입금성공");
		  }else {
			  System.out.println("7000원 출금:출금실패"); 
		  }
		 System.out.println(hong ); 
	}

}