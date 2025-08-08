package JavaDersleri;

public class Ornek1 {
    public static void main(String[] args) {

        int age = 28;
        boolean ehliyet = true;

        if (age >=18) {
            if (ehliyet) {
                System.out.println("Araç Kullanabilirsiniz.");
            } else {
                System.out.println("Ehliyetiniz Yok.");
            }
        }
            else {
                System.out.println("Yaşınız Tutmuyor.");

            }

    }
}
