package JavaDersleri.MethodStatic;

public class Kutu {

    public static void Ad(String name) {
        System.out.println("Adım: " + name);

    }
    public void Soyad(String surName){  // public static void Soyad(String surName) '' olarakda kullanılır eğer 'static kaldırırsan'
                                        // BenimClass da ki kutu2.Soyad kısmındaki 'kutu2' tanımlı nesnein ismini değiştiremezsin.
        System.out.println("Soyadım: " + surName);
    }

}