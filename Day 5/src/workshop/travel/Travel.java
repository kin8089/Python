package workshop.travel;

public class Travel {

	private String travelCode;
	private String cityName;
	private String flight;
	private int travelType;
	private int maxPeople;
	private int reserved;
	public static final int INDIVIDUAL = 0;
	public static final int PACKAGE = 1;
	
	public Travel(String travelCode, String cityName, String flight, int travelType, int maxPeople) {
		System.out.println("�ȳ��ϼ���. ������Դϴ�");
		System.out.println("========<�޴�>========");
		System.out.println("1. ��ü ���� ��ǰ ��ȸ");
		System.out.println("2. ���� �������� ��ǰ ��ȸ");
		System.out.println("3. ��Ű������ ��ǰ ��ȸ");
		System.out.println("4. ���� ��ǰ ����");
		System.out.println("9. ����");
		System.out.println("=====================");
		this.travelCode = travelCode;
		this.cityName = cityName;
		this.flight = flight;
		this.travelType = travelType;
		this.maxPeople = maxPeople;
	}
	public String getTravelCode() {
		return travelCode;
	}
	public void setTravelCode(String travelCode) {
		this.travelCode = travelCode;
}	
	public String getCityName() {
		return cityName;
}
	public void setCityname(String cityName) {
		this.cityName = cityName;
}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public String getTravelType() {
		String type = null;
		if(travelType == INDIVIDUAL) {
			type =  "������������";
		}
		 else if (travelType == PACKAGE) {

			 type =  "��Ű������" ;
		 }
		 return type;
	}

	public int getMaxPeople() {
		return maxPeople;
	}
	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}
	public int getReserved() {
		return reserved;
	}
	public void setReserved(int reserved) {
		
	}

	public void printTravelInfo() {
		System.out.printf("%1$6s  %2$4s  %3$5s  %3$6s    %4$d��     %5$2d��\n", travelCode, cityName, flight, getTravelType(), maxPeople, reserved);
		}
		
	}

