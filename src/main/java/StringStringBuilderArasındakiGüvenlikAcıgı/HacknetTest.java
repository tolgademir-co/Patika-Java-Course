package StringStringBuilderArasındakiGüvenlikAcıgı;

public class HacknetTest {

    public static void main(String[] args) {

                // === 1. Güvenlik Farkı ===
                System.out.println("=== Güvenlik Testi ===");

                // String ile
                String passwordStr = "SuperSecret123";
                System.out.println("String Password (önce): " + passwordStr);
                passwordStr = "********"; // sadece değişkene yeni değer atadık, eski değer hâlâ hafızada
                System.out.println("String Password (sonra): " + passwordStr);

                // StringBuilder ile
                StringBuilder passwordSb = new StringBuilder("SuperSecret123");
                System.out.println("StringBuilder Password (önce): " + passwordSb);
                passwordSb.delete(0, passwordSb.length()); // içerik gerçekten hafızadan silindi
                System.out.println("StringBuilder Password (sonra): " + passwordSb);

                /*
                 * NOT:
                 * Burada heap dump alsak, String versiyonunda "SuperSecret123"
                 * hâlâ hafızada duruyor olurdu.
                 * StringBuilder versiyonunda ise artık içerik yok.
                 */


                // === 2. Performans Testi ===
                System.out.println("\n=== Performans Testi ===");

                // String concat testi
                long startStr = System.currentTimeMillis();
                String testStr = "";
                for (int i = 0; i < 100_000; i++) {
                    testStr += "a"; // her seferinde yeni String oluşturuyor
                }
                long endStr = System.currentTimeMillis();
                System.out.println("String süresi: " + (endStr - startStr) + " ms");

                // StringBuilder append testi
                long startSb = System.currentTimeMillis();
                StringBuilder testSb = new StringBuilder();
                for (int i = 0; i < 100_000; i++) {
                    testSb.append("a"); // aynı nesne üzerinde çalışıyor
                }
                long endSb = System.currentTimeMillis();
                System.out.println("StringBuilder süresi: " + (endSb - startSb) + " ms");
            }
        }
