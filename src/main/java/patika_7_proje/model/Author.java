package patika_7_proje.model;

import patika_7_proje.model.enums.Gender;

import java.time.LocalDate;

public class Author {

    private String name;

    private String surname;

    private Gender gender;

    private LocalDate birthDay;

    private String bio;

    public Author(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", bio='" + bio + '\'' +
                '}';
    }
}
