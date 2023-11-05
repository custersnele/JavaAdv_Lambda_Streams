package be.pxl.ja.exercise1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static List<Student> createStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 2018, 82, LocalDate.of(1998,5,4)));
		students.add(new Student("Bob", 2017, 90, LocalDate.of(1998,8,8)));
		students.add(new Student("Carol", 2018, 67, LocalDate.of(1997, 12,23)));
		students.add(new Student("David", 2018, 80, LocalDate.of(1997, 3,23)));
		students.add(new Student("Eric", 2017, 55, LocalDate.of(1998, 4,15)));
		students.add(new Student("Frank", 2018, 49, LocalDate.of(1996, 10,11)));
		students.add(new Student("Gary", 2017,88, LocalDate.of(1996, 7,12)));
		students.add(new Student("Henry", 2017, 98, LocalDate.of(1997, 8,12)));
		students.add(new Student("Ivan", 2018, 66, LocalDate.of(1999, 3,21)));
		students.add(new Student("John", 2017, 52, LocalDate.of(1997, 1,3)));
		return students;
	}
}
