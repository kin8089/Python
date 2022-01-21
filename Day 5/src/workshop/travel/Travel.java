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
		System.out.println("안녕하세요. 여행사입니다");
		System.out.println("========<메뉴>========");
		System.out.println("1. 전체 여행 상품 조회");
		System.out.println("2. 개별 자유여행 상품 조회");
		System.out.println("3. 패키지여행 상품 조회");
		System.out.println("4. 여행 상품 예약");
		System.out.println("9. 종료");
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
			type =  "개별자유여행";
		}
		 else if (travelType == PACKAGE) {

			 type =  "패키지여행" ;
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
		System.out.printf("%1$6s  %2$4s  %3$5s  %3$6s    %4$d명     %5$2d명\n", travelCode, cityName, flight, getTravelType(), maxPeople, reserved);
		}
		
	}

