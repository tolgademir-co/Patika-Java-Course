package patika_3_methods.methods.methods;

public class Factorial {

    public static void main(String[] args) {

        int factorial = factorial(1000);

        System.out.println("Factorial: " + factorial);

    }
    // 5! = 5 x 4 x 3 x 2 x 1 = 120--

    public static int factorial(int number) {

        if (number == 0) {
            return 1;
        }

        return number * (factorial(number - 1));


    }
}
