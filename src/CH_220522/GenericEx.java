package CH_220522;

public class GenericEx<E> {

    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

}

class Main {
    public static void main(String[] args) {

        GenericEx<String> a = new GenericEx<String>();
        GenericEx<Integer> b = new GenericEx<Integer>();

        a.set("hello");
        b.set(11);

        System.out.println(a.get());
        System.out.println(b.get());
    }
}