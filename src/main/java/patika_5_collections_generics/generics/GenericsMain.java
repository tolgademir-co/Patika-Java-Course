package patika_5_collections_generics.generics;

public class GenericsMain {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setContent(true);

        Box<Animal> animalBox = new Box<>();

        Animal animal = new Animal();
        animalBox.setContent(animal);

        //------------------

        String array[] = {"Java", "Python", "C++", "Javascript"};
        GenericMethodExample.printArray(array);

        Integer array2[] = {1, 2, 3, 4, 5};
        GenericMethodExample.printArray(array2);

        int array3[] = {1, 2, 3, 4, 5}; // int() primiti bir metot olduğu için kullanımı uygun değil
        //GenericMethodExample.printArray(array3); Compile time error -- çünkü primitive tipler


        //------------------

        BoundedGenericExample<Animal> animalBoundedGenericExample = new BoundedGenericExample<Animal>();

        animalBoundedGenericExample.setContent(new Animal());

        // BoundedGenericExample<Integer> integerBoundedGenericExample = new BoundedGenericExample<Integer>(); Compile time error -- çünkü Animal sınırlandırması var.


    }
}
