import java.util.*;

public class code7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        // Using LinkedHashSet to remove duplicates while preserving order
        Set<Integer> set = new LinkedHashSet<>(list);

        // Convert back to List if needed
        List<Integer> result = new ArrayList<>(set);

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + result);
    }
}
