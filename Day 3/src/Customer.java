public class Customer {
		private String ssn;
		private String name;
		private Account account;
		
		public Customer(String ssn, String name) {	
			this.ssn = ssn;
			this.name = name;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
	    public String toString() {
			return  name+"´ÔÀÇ ÇöÀç ÀÜ¾×: "+account.getBalance()+"¿ø";
		}

	}

