public class BankingTest {

	public static void main(String[] args) {
		 Account h_account = new Account(10000);
		 Customer hong = new Customer("0001", "ȫ�浿");
		 hong.setAccount(h_account);
		 System.out.println(hong);
		 if (h_account.deposit(1000)) {
		    System.out.println("1000�� �Ա�:�Աݼ���");
		 }else {
			  System.out.println("1000�� �Ա�:�Աݽ���"); 
		  }
		 
		 System.out.println(hong.toString());
		 if (h_account.withdraw(5000)) {
			 System.out.println("5000�� ���:��ݼ���");
		  }else {
			  System.out.println("5000�� ���:��ݽ���"); 
		  }
		 System.out.println(hong );
		 if (h_account.withdraw(7000)) {
			 System.out.println("7000�� ���:�Աݼ���");
		  }else {
			  System.out.println("7000�� ���:��ݽ���"); 
		  }
		 System.out.println(hong ); 
	}

}