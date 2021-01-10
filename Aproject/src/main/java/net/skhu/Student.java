package net.skhu;

public class Student {
	int id;
	String studentNumber;
	String studentName;
	String email;

	public Student(String studentName, String studentNumber, String email) {
		id = 0;
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.email = email;
	}

	public Student() {
		id = 0;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
