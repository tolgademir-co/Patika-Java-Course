package patika_8_lambdas_functional_interfaces._1_lambdas;

public class CheckIfSwim implements CheckTrait {

    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();

    }
}
