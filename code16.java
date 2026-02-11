class code16 {

    // Generic Swap Method
    public static <T> void swap(Box<T> a, Box<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // Helper Generic Box
    static class Box<T> {
        T value;
        Box(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Box<Integer> a = new Box<>(10);
        Box<Integer> b = new Box<>(20);

        System.out.println("Before Swap: " + a.value + ", " + b.value);
        swap(a, b);
        System.out.println("After Swap: " + a.value + ", " + b.value);

        Box<String> s1 = new Box<>("Hello");
        Box<String> s2 = new Box<>("World");

        swap(s1, s2);
        System.out.println("String Swap: " + s1.value + ", " + s2.value);
    }
}
