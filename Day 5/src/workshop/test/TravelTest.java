package workshop.test;
import workshop.biz.TravelBiz;
import workshop.util.TravelUtil;
import workshop.travel.Travel;
import workshop.biz.TravelBiz;

public class TravelTest {

	public static void main(String[] args) {
		TravelBiz biz = new TravelBiz();
		int menu = 0;
		do {
		 printMenu();
		 System.out.print("## �޴� �Է� :");
		 menu = Integer.parseInt(TravelUtil.getUserInput());
		 switch(menu) {
		 case 1 :  
			 biz.printTravelListTitle();
			 biz.printAllTravels();
			 System.out.println("-----------------------------------------------------");
			 break;
		 case 2 :  
			 biz.printTravelListTitle();
			 biz.printIndividualTravels();
			 System.out.println("-----------------------------------------------------");
			 break;			 
		 case 3 :  
			 biz.printTravelListTitle();
			 biz.printPackageTravels();
			 System.out.println("-----------------------------------------------------");
			 break;
		 case 4 :  
			 System.out.println("���� ��ǰ�� �����մϴ�.");
			 System.out.print("���� �ڵ� �Է� :");
			 String travelCode = TravelUtil.getUserInput();
			 System.out.print("���� �ο� �Է� :");
			 int reserveCount  = Integer.parseInt(TravelUtil.getUserInput());
			 biz.reserveTravel(travelCode, reserveCount);
			 System.out.println("-----------------------------------------------------");
			 break;
		  
		 case 9 :
			 System.out.println("------------------------");
			 System.out.println("���α׷��� �����մϴ�. Bye~");
			 System.out.println("------------------------");
			 System.exit(0);
		default :
			System.out.println("�޴��� �߸� �Է��Ͽ����ϴ�.");
		 }
		}while(menu!=9);

	}
	
	public static void printMenu() {
		System.out.println("====== < �޴� > ======");
		System.out.println("1.��ü ���� ��ǰ ��ȸ");
		System.out.println("2.���� �������� ��ǰ ��ȸ");
		System.out.println("3.��Ű������ ��ǰ ��ȸ");
		System.out.println("4.���� ��ǰ ����");
		System.out.println("9.����");
		System.out.println("======================");
	}
}
