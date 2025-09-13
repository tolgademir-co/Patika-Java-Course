package patika_10_exception_localization._1_exception.custom_exception;

public class MembershipTest {

    public static void main(String[] args) {

        Membership membership = new Membership();
        try {
            membership.register(17);
        } catch (AgeRestictrintionException e) {
            System.out.println("Hata: " + e.getMessage());
        }
        // TODO ŞİFREMİ UNUTTUM
        System.out.println("Uygulama devam ediyor..");

    }
}
