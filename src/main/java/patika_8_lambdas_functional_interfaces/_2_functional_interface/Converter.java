package patika_8_lambdas_functional_interfaces._2_functional_interface;

@FunctionalInterface
public interface Converter {

    double convert(double value);

    default void printConversion(double value) { // default bir değer olduğu için body'si mevcut
        System.out.println("Sonuç: " + convert(value));

    }
}
