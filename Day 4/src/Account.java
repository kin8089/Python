
public class Account {
	public String customerid;
	public String customername;
	public String customernumber;
	public int balance;
	
	
	
	public Account(String customerid, String customername, String customernumber, int balance) {
		this.customerid = customerid;
		this.customername = customername;
		this.customernumber = customernumber;
		this.balance = balance;
		System.out.println("[공지]계좌를 개설합니다");
		System.out.println("====================");
		System.out.println("고객번호:" + this.customerid);
		System.out.println("고객명:" + this.customername);
		System.out.println("계좌번호:" + this.customernumber);
		System.out.println("잔액:" + this.balance);
		System.out.println("====================");
		}
		public String getCustomerId() {
			return customerid;
		}
		public String getCustomerName() {
			return customername;
		}
		public String getCustomerNumber() {
			return customernumber;
		}
		public int getBalance() {
			return balance;
		}
		public void withdraw(int money) {
			if (money> 0 && balance > money) {
				balance -= money;System.out.println("[출금]"+money+"원을 출금합니다.");
				System.out.println("====================");
				System.out.println("고객번호:" + this.customerid);
				System.out.println("고객명:" + this.customername);
				System.out.println("계좌번호:" + this.customernumber);
				System.out.println("잔액:" + this.balance);
				System.out.println("====================");
		}
			else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		public void deposit(int money) {
			if (money> 0) {
				balance += money;
				System.out.println("[입금]"+money+"원을 입금합니다.");
				System.out.println("====================");
				System.out.println("고객번호:" + this.customerid);
				System.out.println("고객명:" + this.customername);
				System.out.println("계좌번호:" + this.customernumber);
				System.out.println("잔액:" + this.balance);
				System.out.println("====================");
}
		}
		public void printAccountInfo() {
			System.out.println("[정보]계좌를 조회합니다.");
			System.out.println("====================");
			System.out.println("고객번호:" + this.customerid);
			System.out.println("고객명:" + this.customername);
			System.out.println("계좌번호:" + this.customernumber);
			System.out.println("잔액:" + this.balance);
			System.out.println("====================");
		}
}

