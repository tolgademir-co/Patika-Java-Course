package patika_6_beyond_classes.local_class;

public class LocalClassExample3 {

    public void display() {

        final String greenting = "Hi, Patika!";

        class Local {

            void message() {
                System.out.println(greenting);
            }

        }

        Local local = new Local();
        local.message();
    }
}
