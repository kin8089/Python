public class Account {
		private int balance;
		 
		public Account(int balance) {		 
			this.balance = balance;
		}
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public boolean deposit(int amount) {
			boolean flag = false;
			if (amount> 0) {
				balance += amount;
				flag = true;
			}
			return flag;
		}
		public boolean withdraw(int amount) {
			boolean flag = false;
			if (amount> 0 && balance > amount) {
				balance -= amount;
				flag = true;
			}
			return flag;
		}
	}