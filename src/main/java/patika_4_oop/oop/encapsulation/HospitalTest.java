package patika_4_oop.oop.encapsulation;

public class HospitalTest {

    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.identityNumber = "123";
        patient.setName("Serra");
        patient.setSurname("Demir");
        patient.setAge(27);


        Patient patient1 = new Patient("1234");
        patient1.setName("Tolga");
        patient1.setSurname("Demir");

        Patient patient2 = new Patient("12345678901");
        patient2.setName("Fatma");
        patient2.setSurname("Beyaz");

    }
}
