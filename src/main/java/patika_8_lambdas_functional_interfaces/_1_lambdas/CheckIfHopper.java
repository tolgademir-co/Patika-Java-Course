package patika_8_lambdas_functional_interfaces._1_lambdas;

public class CheckIfHopper implements CheckTrait{

    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
