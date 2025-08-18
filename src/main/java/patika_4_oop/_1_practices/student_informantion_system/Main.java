package patika_4_oop._1_practices.student_informantion_system;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[5];

        Teacher mathTeacher = new Teacher("Tolga", "Demir", "0538-123-66-14");
        Teacher pysicsTeacher = new Teacher("Serra", "Leblebici", "0538-432-23-13");
        Teacher chemistryTeacher = new Teacher("Ayşe", "Sarı", "0538-856-87-12");
        Teacher bioglogyTeacher = new Teacher("Duygu", "Dayak", "0538-867-23-11");
        Teacher pysicalEducationTeacher = new Teacher("Bahri", "Sayın", "0538-434-64-10");

        teachers[0] = mathTeacher;
        teachers[1] = pysicsTeacher;
        teachers[2] = chemistryTeacher;
        teachers[3] = bioglogyTeacher;
        teachers[4] = pysicalEducationTeacher;

        Course mathCourse = new Course("Matematik", "Mat101", 8);
        Course pysicsCourse = new Course("Fizik", "FZK101", 6);
        Course chemistryCourse = new Course("Kimya", "KMY101", 6);
        Course bioglogyCourse = new Course("Biyoloji", "BİO101", 4);
        Course pysicalEducationCourse = new Course("Beden Eğitimi Dersi", "BND101", 2);

        mathCourse.setTeacher(mathTeacher);
        pysicsCourse.setTeacher(pysicsTeacher);
        chemistryCourse.setTeacher(chemistryTeacher);
        bioglogyCourse.setTeacher(bioglogyTeacher);
        pysicalEducationCourse.setTeacher(pysicalEducationTeacher);

        mathTeacher.setCourse(mathCourse);
        pysicsTeacher.setCourse(pysicsCourse);
        chemistryTeacher.setCourse(chemistryCourse);
        bioglogyTeacher.setCourse(bioglogyCourse);
        pysicalEducationTeacher.setCourse(pysicalEducationCourse);

        Student[] students = new Student[4];

        Student student1 = new Student("Cem", "Dırman", LocalDate.of(1991, 03, 23), 001);
        Student student2 = new Student("Nehir", "Al", LocalDate.of(2015, 05, 23), 002);
        Student student3 = new Student("Emir", "Al", LocalDate.of(2015, 06, 23), 003);
        Student student4 = new Student("Zeynep", "Kırmızı", LocalDate.of(2015, 07, 23), 004);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        Course[] courses = new Course[5];
        courses[0] = mathCourse;
        courses[1] = pysicsCourse;
        courses[2] = chemistryCourse;
        courses[3] = bioglogyCourse;
        courses[4] = pysicalEducationCourse;


        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        for (Course course : courses) {
            System.out.println(course);
        }

        for (Student student : students) {
            System.out.println(student);
        }

        //

        student1.addCourse(mathCourse, 0);
        student1.addCourse(pysicsCourse, 1);
        student1.addCourse(chemistryCourse, 2);
        student1.addCourse(bioglogyCourse, 3);
        student1.addCourse(pysicalEducationCourse, 4);

        student2.addCourse(mathCourse, 0);
        student2.addCourse(pysicsCourse, 1);
        student2.addCourse(chemistryCourse, 2);
        student2.addCourse(bioglogyCourse, 3);
        student2.addCourse(pysicalEducationCourse, 4);

        student3.addCourse(mathCourse, 0);
        student3.addCourse(pysicsCourse, 1);
        student3.addCourse(chemistryCourse, 2);
        student3.addCourse(bioglogyCourse, 3);
        student3.addCourse(pysicalEducationCourse, 4);

        student4.addCourse(mathCourse, 0);
        student4.addCourse(pysicsCourse, 1);
        student4.addCourse(chemistryCourse, 2);
        student4.addCourse(bioglogyCourse, 3);
        student4.addCourse(pysicalEducationCourse, 4);
        // student1.addCourse(mathCourse, 5); en fazla 5 ders ekleyebildiğin için yeni bir ders ekleyemezsin..

        student1.addNotes(mathCourse, 85);
        student1.addNotes(pysicsCourse, 55);
        student1.addNotes(chemistryCourse, 25);
        student1.addNotes(bioglogyCourse, 95);
        student1.addNotes(pysicalEducationCourse, 100);

        student2.addNotes(mathCourse, 25);
        student2.addNotes(pysicsCourse, 74);
        student2.addNotes(chemistryCourse, 83);
        student2.addNotes(bioglogyCourse, 59);
        student2.addNotes(pysicalEducationCourse, 97);

        student3.addNotes(mathCourse, 25);
        student3.addNotes(pysicsCourse, 74);
        student3.addNotes(chemistryCourse, 83);
        student3.addNotes(bioglogyCourse, 59);
        student3.addNotes(pysicalEducationCourse, 97);

        student4.addNotes(mathCourse, 25);
        student4.addNotes(pysicsCourse, 74);
        student4.addNotes(chemistryCourse, 83);
        student4.addNotes(bioglogyCourse, 59);
        student4.addNotes(pysicalEducationCourse, 97);

        for (Student student : students) {

            for (Course c1 : student.getCourses()) {
                System.out.println(student.getName().toUpperCase() + " öğrencisi " + c1.getName().toUpperCase() + " dersi için" + c1.getName() + "notunu almıştır!");

            }

        }

    }
}
