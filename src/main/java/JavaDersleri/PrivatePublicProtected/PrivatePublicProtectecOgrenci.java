package JavaDersleri.PrivatePublicProtected;

import JavaDersleri.Ogrenci;

public class PrivatePublicProtectecOgrenci {

    public int id; // değişken-field-property

    public String isim;

    public String soyisim;

    private String cinsiyet; // dış dünyaya kapalı.

    // method overloading
    // parametre sayısı farklı olacak
    // parametre tipleri farklı olması.s

    public PrivatePublicProtectecOgrenci() {
    }

    public PrivatePublicProtectecOgrenci(String p_cinsiyet) {

        cinsiyet = p_cinsiyet;
        // this.cinsiyet=cinsiyet; - BUDA DOĞRU BİR KULLANIM SADECE ** YUKARIDAKİ PUBLİC () İÇİNDEKİ String cinsiyet) olucak
    }

    public void cinsiyetYazdir()
    {
        System.out.println("Cinsiyet: "+ this.cinsiyet);
    }

    public PrivatePublicProtectecOgrenci(int id, String isim, String soyisim) {
        //this : şuan üzerinden çalıştığım class
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
    }
}
