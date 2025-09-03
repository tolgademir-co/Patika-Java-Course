package patika_9_streams._2_intermadiate;

import patika_4_oop._1_practices.student_informantion_system.Course;

import java.util.List;

public class Student {

    private String name;

    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
