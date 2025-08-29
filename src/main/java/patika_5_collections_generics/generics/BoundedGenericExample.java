package patika_5_collections_generics.generics;

public class BoundedGenericExample <T extends Animal> {

    // private static T content; static Generic ifadesi ekleyemeyiz--

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
