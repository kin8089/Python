package Grade.test;

import Grade.biz.GradeManager;
import Grade.biz.IGradeManager;
import Grade.util.CommonUtil;

public class GradeTest {
	public static void printMenu() {
		System.out.println("==<<성적 관리 시스템 메뉴>>==");
		System.out.println("1. 전체 수강생 출력");
		System.out.println("2. 합격 수강생 출력");
		System.out.println("3. 불합격 수강생 출력");
		System.out.println("9. 종료");
		System.out.println("==========================");
	}

	public static void main(String[] args) {
		GradeManager obj = new GradeManager();

		while (true) {
			printMenu();
			String menu = CommonUtil.getUserInput();
			switch (menu) {
			case "1":
				obj.printStudent(IGradeManager.PRINT_ALL);
				break;
			case "2":
				obj.printStudent(IGradeManager.PRINT_PASS);
				break;
			case "3":
				obj.printStudent(IGradeManager.PRINT_FAIL);
				break;
			case "9":
				System.out.println("시스템을 종료합니다");
				System.exit(0);
				break;
			default:
					System.out.println("없는 메뉴를 선택하셨습니다");
				break;
			}
		}
	}
}