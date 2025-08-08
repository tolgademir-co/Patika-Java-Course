package patika_1_basic.loops;

public class WhileLoopTest2 {

    public static void main(String[] args) {

        int i = 0;

        int sum = 0;

        while (i < 100) {

            if (i % 5 == 0) {
                System.out.println(i + "değeri hesaba dahil değil.");
                i++;
                continue;
            }
            System.out.println(i + "i: değeri");
            sum += i;
            i++;
        }

        System.out.println("Toplam: " + sum);
    }
}
