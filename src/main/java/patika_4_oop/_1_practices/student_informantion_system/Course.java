package patika_4_oop._1_practices.student_informantion_system;

public class Course {

    private String name;

    private String code;

    private Integer hourseOfWeek;

    private Teacher teacher;

    private Integer note;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, String code, Integer hourseOfWeek) {
        this.name = name;
        this.code = code;
        this.hourseOfWeek = hourseOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getHourseOfWeek() {
        return hourseOfWeek;
    }

    public void setHourseOfWeek(Integer hourseOfWeek) {
        this.hourseOfWeek = hourseOfWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hourseOfWeek=" + hourseOfWeek +
                '}';
    }
}
