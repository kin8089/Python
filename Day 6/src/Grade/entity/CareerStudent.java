package Grade.entity;

public class CareerStudent extends Student {
	private int careerYears;

	public CareerStudent(String studentNo, String studentName, int[] gradeArr, int careerYears) {
		super(studentNo, studentName, gradeArr);
		this.careerYears = careerYears;
	}

	public int getCarrerYears() {
		return careerYears;
	}

	public void setCareerYears(int careerYears) {
		this.careerYears = careerYears;
	}
	
	public boolean isPass() {
		if (getAverage() >= 80) {
			return true;
		} else {
			return false;
		}
	}

}