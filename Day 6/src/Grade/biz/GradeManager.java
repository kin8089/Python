package Grade.biz;

import Grade.entity.CareerStudent;
import Grade.entity.NewStudent;
import Grade.entity.Student;

public class GradeManager implements IGradeManager {
	private Student[] students = new Student[30];;
	private int cnt = 0;		

	public GradeManager() {

		students[0] = new NewStudent("10001", "kim", new int[] { 74, 70, 80 }, false);
		students[1] = new NewStudent("10005", "park", new int[] { 90, 90, 100 }, false);
		students[2] = new NewStudent("10009", "lee", new int[] { 70, 62, 60 }, true);
		students[3] = new CareerStudent("20001", "han", new int[] { 96, 85, 93 }, 1);
		students[4] = new CareerStudent("20005", "nam", new int[] { 90, 80, 73 }, 2);
		students[5] = new CareerStudent("20009", "choi", new int[] { 70, 70, 90 }, 1);
	}

	@Override
	public void printStudent(int printType) {
		System.out.println("===================================================================");
		System.out.println("���   �̸�  ����/��� ���Ͽ��� ��³��   C  Linux  Java ���� ��� �հݿ���");
		System.out.println("===================================================================");

		for (Student student : students) {
			if (student == null) {
				break;
			}

			String show = "";
			
			show = String.format("%-6s %-6s ", student.getStudentNo(), student.getStudentName());

			if (student instanceof NewStudent) {
				show += "����" + "      ";
				if (((NewStudent) student).isInternYn()) {
					show += "Y";
				} else {
					show += "N";
				}
				show += "            ";
			} else if (student instanceof CareerStudent) {
				show += "���" + "      ";
				show += "      " + ((CareerStudent) student).getCarrerYears();
				show += "      ";
			}
			show += student;

			if (student.isPass()) {
				show += "�հ�";
			} else {
				show += "���հ�";
			}

			switch (printType) {
			case IGradeManager.PRINT_ALL:
				System.out.println(show);
				break;
			case IGradeManager.PRINT_PASS:
				if (student.isPass()) {
					System.out.println(show);
				}
				break;
			case IGradeManager.PRINT_FAIL:
				if (!student.isPass()) {
					System.out.println(show);
				}
				break;
			default:
				break;
			}

		}

		System.out.println("===================================================================");
	}

}