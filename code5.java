class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class code5 {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());
    }
}