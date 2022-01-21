package Grade.entity;

import Grade.util.CommonUtil;

public abstract class Student {
	private String studentNo, studentName;
	private int[] gradeArr;

	public Student(String studentNo, String studentName, int[] gradeArr) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.gradeArr = gradeArr;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int[] getGradeArr() {
		return gradeArr;
	}

	public void setGradeArr(int[] gradeArr) {
		this.gradeArr = gradeArr;
	}

	public int getTotal() {
		int sum = 0;
		for (int a : gradeArr) {
			sum += a;
		}
		return sum;
	}

	public double getAverage() {
		return getTotal() / new Double(gradeArr.length);
	}

	public abstract boolean isPass();

	@Override
	public String toString() {
		String str = "";
		for (int a : gradeArr) { 
			str += String.format("%-3s  ", a);                // -3 : 문자열 왼쪽 정렬
		}
		str += String.format("%-3s  ", getTotal());      
		str += String.format("%-3s  ", CommonUtil.round(getAverage()));

		return str;
////		return studentNo + " " + studentName;
	}
}
