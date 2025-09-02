package patika_6_beyond_classes.enums;

public enum Operation {

    // Addtion - Toplama - ADD & +
    ADD {
        @Override
        public int apply(int number1, int number2) {
            return number1 + number2;
        }
    },

    // Substraction - Çıkarma - SUB & -
    SUBTRACT {
        @Override
        public int apply(int number1, int number2) {
            return number1 - number2;
        }
    },

    // Multiplication - Çarpma - MUL & *
    MUL {
        @Override
        public int apply(int number1, int number2) {
            return number1 * number2;
        }
    },

    // Division - Bölme - DIV & /
    DIV {
        @Override
        public int apply(int number1, int number2) {
            return number1 / number2;
        }
    };

    public abstract int apply(int number1, int number2);
    }
