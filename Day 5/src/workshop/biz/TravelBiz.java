package workshop.biz;
import java.util.Scanner;
import workshop.travel.Travel;


public class TravelBiz {
		private Travel[] travels;		
		

		public TravelBiz() {
			travels = new Travel[] {
				new Travel("TRV001", "����", "�����װ�",   Travel.INDIVIDUAL, 10),
				new Travel("TRV002", "������", "����������", Travel.INDIVIDUAL,7),
				new Travel("TRV003", "LA", "��Ÿ�װ�", Travel.PACKAGE,12),
				new Travel("TRV004", "�����ī", "�����Ѱ�",Travel.INDIVIDUAL,15),
				new Travel("TRV005","����", "�����װ�", Travel.PACKAGE,10)
			};    //travels[0] = new Travel();
	}
		
		public void printAllTravels() {
	        for (Travel t : travels) {
	        	t.printTravelInfo();
	    }
		}
		
		public void printIndividualTravels() {
			for (Travel t : travels) {
				if (t.getTravelType().equals("������������")) {
					t.printTravelInfo();
				}
				
			}
			
	} 
		public void printPackageTravels() {
			for (Travel t : travels) {
				if (t.getTravelType().equals("��Ű������")) {
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
						System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						t = travel;
					}else {
						System.out.println("���� ���� �ο��� �ʰ��Ǿ����ϴ�.(���� ���� �ο�: "+people+"��)");
					}				
				} //outer if end
			}//for end
			return t;
		}

		public void printTravelListTitle() {
			System.out.println();
		}
}
