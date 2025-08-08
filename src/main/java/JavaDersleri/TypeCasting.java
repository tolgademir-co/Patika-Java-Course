package JavaDersleri;

public class TypeCasting {

    public static void main(String[] args) {

        // byte, short, int, long, float, double
        // Auto Widenning (Otomatik Genişletme)
        // Explicit Narrowing (Açıkça Daraltma)

        byte numByte = 15;
        int numInt = numByte; // Auto Widenning -- KÜÇÜKTEN BÜYÜYE TYPECAST EDERKEN PROBLEM YOK--

        double numDouble = 25.3;
        short numShort = (short) numDouble; // Explicit Narrowing -- BÜYÜKTEN KÜÇÜĞE TYPECAST EDERKEN UYARI VERİYOR ORDADA (short) GEREKLİ !!

    }
}
