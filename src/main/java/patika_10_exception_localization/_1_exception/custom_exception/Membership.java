package patika_10_exception_localization._1_exception.custom_exception;

public class Membership {

    public void register(int age) throws AgeRestictrintionException {

        if (age < 18) {
            throw new AgeRestictrintionException("Üyelik için en az 18 yaşında olmalısınız!");
        }

        System.out.println("Üyelik başarılı olarak oluşturuldu.");

    }
}
