package be.pxl.ja.exercise1;

import java.time.LocalDate;

public class Student implements Comparable<Student>{
	private String name;
	private int graduationYear;
	private int score;
	private LocalDate dateOfBirth;

	public Student(String name, int graduationYear, int score, LocalDate dateOfBirth) {
		this.name = name;
		this.graduationYear = graduationYear;
		this.score = score;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public int getScore() {
		return score;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", graduationYear=" + graduationYear +
				", score=" + score +
				", dateOfBirth=" + dateOfBirth +
				'}';
	}

	@Override
	public int compareTo(Student o) {
		return o.getScore() - this.getScore();
	}
}
