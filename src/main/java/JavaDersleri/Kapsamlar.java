package JavaDersleri;

public class Kapsamlar {

    public static void main(String[] args) {

        int degisken1 = 100;
        int degisken2 = 200;
        System.out.println(degisken1); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
        System.out.println(degisken2); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--

        // System.out.println(degisken6); sen daha degisken 1 ve 2 tanımladın aşağıdakii kod bloğunu okumaz önce tanımlaman lazım sonra sout ile ekrana çıktı vermen lazım

        {
            int degisken3 = 300;
            System.out.println(degisken3); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            System.out.println(degisken2); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            System.out.println(degisken1); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            {
                int degisken4 = 400;
                System.out.println(degisken4); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
                System.out.println(degisken3); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
                System.out.println(degisken2); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
                System.out.println(degisken1); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            }
            int degisken5 = 500;
            System.out.println(degisken5); // degisken 4 ve 6(YUKARIDAN AŞAĞIYA KOD OKUMA OLDUĞUNU İÇİN ULAŞAMZ) erişim mi yok!! çünkü o farklı bir scope'da -- 1, 2, 3, 5 degiskenine ulaşım sağlayabilir bu metot
            System.out.println(degisken3); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            System.out.println(degisken2); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
            System.out.println(degisken1); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--


        }
        int degisken6 = 600;
        System.out.println(degisken6); // degisken 1, 2, 6 erişim sağlar 3, 4, 5, degiskenine erişim sağlayamaz o farklı bir scope'da (KOD BLOĞU YUKARIDAN AŞAĞI OKUSADA FARKLI SCOPE'DA OLAN KODLARA ERİŞİM SAĞLAYAMAZ)
        System.out.println(degisken2); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--
        System.out.println(degisken1); // ÖRNEKLE ANLA DİYE SOUT YAZDIRDIM--


    }
}
