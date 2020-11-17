package be.pxl.ja.exercise1;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oefening73 {

    public static void main(String[] args) {

        List<Student> studentList = StudentDao.createStudents();

        // Stream<Student> studentStream = StudentDao.createStudents().stream();
        // IllegalStateException: stream has already been operated upon or closed

        // 1
        System.out.println("1) De jarige: ");
        studentList.stream()
                .filter(s -> s.getDateOfBirth().getDayOfMonth() == LocalDate.now().getDayOfMonth()
                        && s.getDateOfBirth().getDayOfMonth() == LocalDate.now().getDayOfMonth())
                .forEach(s -> System.out.println(s.getName()));

        // 2
        System.out.println("");
        System.out.print("2) Carlo: ");
        studentList.stream()
                .filter(s -> s.getName().equals("Carol"))
                .forEach(System.out::println);
        System.out.println();

        // 3
        System.out.println("3) Studenten afgestudeerd in 2017: " +
                studentList.stream()
                        .filter(s -> s.getGraduationYear() == 2017)
                        .count()
        );

        // 4 - hoogste score
        System.out.println();
        System.out.print("4) Hoogste score: ");
//        studentList.stream()
//                .sorted()
//                .limit(1)
//                .forEach(System.out::println);
        System.out.println(studentList.stream()
                .sorted().findFirst().get());
        System.out.println();

        // 5
        System.out.print("5) De oudste student: ");
        System.out.println(
//                studentList.stream()
//                        .sorted( (s1, s2) -> s1.getDateOfBirth().compareTo(s2.getDateOfBirth()))
//                        .findFirst()
//                        .get()
                studentList.stream()
                        .min(Comparator.comparing(Student::getDateOfBirth))
        );
        System.out.println();

        // 6
        System.out.print("6) Alle studenten: ");
        System.out.println(
                studentList.stream()
                        .map(Student::getName)
                        .collect(Collectors.joining(","))
        );
        System.out.println();

        // 7
        System.out.print("7) De jongste van afstudeerjaar 2018: ");
        System.out.println(
                studentList.stream()
                        .filter(s -> s.getGraduationYear() == 2018)
                        .min(Comparator.comparing(Student::getDateOfBirth))
                        .get()
        );

        // 8
        System.out.print("8) Gemiddelde score per jaar: ");
        Map<Integer, Double> averageScorePerYearMap = studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getGraduationYear,
                        Collectors.averagingInt(Student::getScore)
                ));
        System.out.println(averageScorePerYearMap);

        // 9
        System.out.println("Studenten gesorteerd: ");
        studentList.stream()
                .sorted(
                        Comparator.comparing(Student::getGraduationYear)
                                .thenComparing(Student::getScore).reversed())
                .forEach(s -> System.out.println(s.getName() + " - " + s.getGraduationYear() + " - " + s.getScore()));


    }


}
