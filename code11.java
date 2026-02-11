import java.util.*;

public class code11 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        // LinkedHashSet removes duplicates and keeps insertion order
        Set<Integer> set = new LinkedHashSet<>();

        set.addAll(list1);
        set.addAll(list2);

        List<Integer> result = new ArrayList<>(set);

        System.out.println("Merged List Without Duplicates: " + result);
    }
}
