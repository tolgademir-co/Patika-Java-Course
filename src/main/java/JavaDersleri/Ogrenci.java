package JavaDersleri;

public class Ogrenci {

    private Long id;
    private String ad;
    private String soyadı;
    private static String numara; // Statik alan

    // Getter ve Setter Metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyadı() {
        return soyadı;
    }

    public void setSoyadı(String soyadı) {
        this.soyadı = soyadı;
    }

    // Static alan için static getter ve setter
    public static String getNumara() {
        return numara;
    }

    public static void setNumara(String numara) {
        Ogrenci.numara = numara;
    }
}