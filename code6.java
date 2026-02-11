public class code6 {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;   // This will cause ArithmeticException
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Always executes");
        }
    }
}