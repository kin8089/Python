
package Grade.entity;

public class NewStudent extends Student {
	private boolean internYn;

	public NewStudent(String studentNo, String studentName, int[] gradeArr, boolean internYn) {
		super(studentNo, studentName, gradeArr);
		this.internYn = internYn;
	}

	public boolean isInternYn() {
		return internYn;
	}

	public void setInternYn(boolean internYn) {
		this.internYn = internYn;
	}

	public boolean isPass() {
		if (getAverage() >= 70) {
			return true;
		} else {
			return false;
		}
	}

}
