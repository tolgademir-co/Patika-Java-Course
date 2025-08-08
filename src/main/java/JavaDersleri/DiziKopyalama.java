package JavaDersleri;

public class DiziKopyalama {

    public static void main(String[] args) {


        int [] dizi1 = {2, 3, 4, 5, 8, 1, 4, 1231, 23, 64, 767};
        int [] dizi2 = new int[dizi1.length];

        System.arraycopy(dizi1 , 0 , dizi2, 0, 6);

        /*
        for (int i = 0 i < dizi1.length; i++) {
            dizi2[i] = dizi1[i];

         */

            for (int i = 0; i < dizi2.length; i++) {
                System.out.println(dizi2[i]);
            }
        }
    }