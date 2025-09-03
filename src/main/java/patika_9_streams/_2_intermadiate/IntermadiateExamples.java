package patika_9_streams._2_intermadiate;

import patika_4_oop._1_practices.student_informantion_system.Course;

import java.util.List;
import java.util.Optional;

public class IntermadiateExamples {

    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Ayşe", "Veli");

        names.stream().forEach(System.out::println);

        names.forEach(System.out::println);

        names.forEach(name -> {

            if (name.startsWith("A")) {

            }
            name.toUpperCase();

        });

        List<Student> students = List.of(
                new Student("Ali", List.of(new Course("Matamatik"), new Course("Fizik"))),
                new Student("Zeynep", List.of(new Course("Kimya"), new Course("Biyoloji"))),
                new Student("Mehmet", List.of(new Course("Tarih"), new Course("Coğrafya"), new Course("Fizik")))

        );

        Optional<Course> optionalMatamatik = students.stream()
                .flatMap(student -> student.getCourses().stream())
                .filter(course -> course.getName().equals("Matamatik"))
                .findFirst();

        System.out.println(optionalMatamatik.get());

        Optional<String> optionalString = students
                .stream()
                .flatMap(student -> student.getCourses().stream())
                .filter(course -> course.getName().equals("Matamatik"))
                .map(course -> course.getName().toUpperCase())
                .findFirst();

        System.out.println(optionalString.get());


        students.stream()
                .filter(student -> student.getName().equals("Ali"))
                .map(student -> student.getName())
                .peek(name -> name.trim())
                .filter(string -> string.endsWith("i"))
                .toList();

    }
}
