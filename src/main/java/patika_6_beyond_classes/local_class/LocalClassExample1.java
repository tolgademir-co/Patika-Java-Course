package patika_6_beyond_classes.local_class;

public class LocalClassExample1 { // BİR CLASS

    public void display() { // ** BİR METHOD

        class Local {

            void message() {
                System.out.println("Local class");
            }

        }

        Local local = new Local();
        local.message();
    }
}
