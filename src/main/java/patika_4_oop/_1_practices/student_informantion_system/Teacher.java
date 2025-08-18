package patika_4_oop._1_practices.student_informantion_system;

public class Teacher {

    private String name;

    private String surname;

    private String phone;

    private Course course;

    //private String courseName; yanlış modelleme. OOP NEREDE?

    public Teacher(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher(String name, String surname, String phone, Course course) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.course = course;
    }
}
