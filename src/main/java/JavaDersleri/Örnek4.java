package JavaDersleri;

public class Örnek4 {
    public static void main(String[] args) {

        int hours = 10;
        boolean haftaSonu = false;

        if (hours < 18) {
            System.out.println("GünaydıN!");
        }
        else {
            if (haftaSonu) {
                System.out.println("İyi Akşamlar,Keyifli bir hafta sonu");
            }
            else {
                System.out.println("İyi Akşamlar,İşten çıktınız mı?");

            }

        }
    }
}
