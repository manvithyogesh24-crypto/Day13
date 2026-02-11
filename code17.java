class code17 {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum: " + findMax(3, 7, 5));
    }
}
