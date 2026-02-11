// Generic Class
class code15<T> {

    private T value;

    // set method
    public void set(T value) {
        this.value = value;
    }

    // get method
    public T get() {
        return value;
    }

    // Main method to test
    public static void main(String[] args) {

        // Box for Integer
        code15<Integer> intBox = new code15<>();
        intBox.set(100);
        System.out.println("Integer Box contains: " + intBox.get());

        // Box for String
        code15<String> strBox = new code15<>();
        strBox.set("Hello Java");
        System.out.println("String Box contains: " + strBox.get());
    }
}
