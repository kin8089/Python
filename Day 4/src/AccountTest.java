
public class AccountTest {

	public static void main(String[] args) {
		Account account  = new Account("kin","������","123456",10000);
		
		account.deposit(50000);
		
		account.withdraw(45000);
	}

}
