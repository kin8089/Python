package Grade.test;

import Grade.biz.GradeManager;
import Grade.biz.IGradeManager;
import Grade.util.CommonUtil;

public class GradeTest {
	public static void printMenu() {
		System.out.println("==<<���� ���� �ý��� �޴�>>==");
		System.out.println("1. ��ü ������ ���");
		System.out.println("2. �հ� ������ ���");
		System.out.println("3. ���հ� ������ ���");
		System.out.println("9. ����");
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
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
				break;
			default:
					System.out.println("���� �޴��� �����ϼ̽��ϴ�");
				break;
			}
		}
	}
}