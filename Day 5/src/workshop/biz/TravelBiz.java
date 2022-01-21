package workshop.biz;
import java.util.Scanner;
import workshop.travel.Travel;


public class TravelBiz {
		private Travel[] travels;		
		

		public TravelBiz() {
			travels = new Travel[] {
				new Travel("TRV001", "뭔헨", "독일항공",   Travel.INDIVIDUAL, 10),
				new Travel("TRV002", "프라하", "에어프랑스", Travel.INDIVIDUAL,7),
				new Travel("TRV003", "LA", "델타항공", Travel.PACKAGE,12),
				new Travel("TRV004", "후쿠오카", "대한한공",Travel.INDIVIDUAL,15),
				new Travel("TRV005","상해", "남방항공", Travel.PACKAGE,10)
			};    //travels[0] = new Travel();
	}
		
		public void printAllTravels() {
	        for (Travel t : travels) {
	        	t.printTravelInfo();
	    }
		}
		
		public void printIndividualTravels() {
			for (Travel t : travels) {
				if (t.getTravelType().equals("개별자유여행")) {
					t.printTravelInfo();
				}
				
			}
			
	} 
		public void printPackageTravels() {
			for (Travel t : travels) {
				if (t.getTravelType().equals("패키지여행")) {
					t.printTravelInfo();
				}
		
}
		}
		public Travel reserveTravel(String travelCode, int reserveCount) {
			Travel t = null;
			for (Travel travel : travels) {
				if (t.getTravelCode().equals(travelCode) ) {
					 int people = travel.getMaxPeople()-travel.getReserved();
					if (people> reserveCount){
						travel.setReserved(travel.getReserved()+reserveCount);
						System.out.println("예약이 완료되었습니다.");
						t = travel;
					}else {
						System.out.println("예약 가능 인원이 초과되었습니다.(예약 가능 인원: "+people+"명)");
					}				
				} //outer if end
			}//for end
			return t;
		}

		public void printTravelListTitle() {
			System.out.println();
		}
}
