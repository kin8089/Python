
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
		System.out.println("[����]���¸� �����մϴ�");
		System.out.println("====================");
		System.out.println("����ȣ:" + this.customerid);
		System.out.println("����:" + this.customername);
		System.out.println("���¹�ȣ:" + this.customernumber);
		System.out.println("�ܾ�:" + this.balance);
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
				balance -= money;System.out.println("[���]"+money+"���� ����մϴ�.");
				System.out.println("====================");
				System.out.println("����ȣ:" + this.customerid);
				System.out.println("����:" + this.customername);
				System.out.println("���¹�ȣ:" + this.customernumber);
				System.out.println("�ܾ�:" + this.balance);
				System.out.println("====================");
		}
			else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
		public void deposit(int money) {
			if (money> 0) {
				balance += money;
				System.out.println("[�Ա�]"+money+"���� �Ա��մϴ�.");
				System.out.println("====================");
				System.out.println("����ȣ:" + this.customerid);
				System.out.println("����:" + this.customername);
				System.out.println("���¹�ȣ:" + this.customernumber);
				System.out.println("�ܾ�:" + this.balance);
				System.out.println("====================");
}
		}
		public void printAccountInfo() {
			System.out.println("[����]���¸� ��ȸ�մϴ�.");
			System.out.println("====================");
			System.out.println("����ȣ:" + this.customerid);
			System.out.println("����:" + this.customername);
			System.out.println("���¹�ȣ:" + this.customernumber);
			System.out.println("�ܾ�:" + this.balance);
			System.out.println("====================");
		}
}

