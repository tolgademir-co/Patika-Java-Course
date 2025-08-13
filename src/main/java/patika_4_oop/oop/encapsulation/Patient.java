package patika_4_oop.oop.encapsulation;

public class Patient {

     String identityNumber;

    private String name;

    private String surname;

    private int age;

    public Patient() {
    }

    public Patient(String identityNumber) {
        setIdentityNumber(identityNumber);
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {

        if (identityNumber.length() != 11) {
            System.out.println("11 haneden farklı bir TCKN numarası giremezsiniz!");
        } else {
            this.identityNumber = identityNumber;
            System.out.println("Doğru TCKN girdiniz! Hasta kaydına ulaşıldı!");
        }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
