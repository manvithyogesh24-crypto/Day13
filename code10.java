import java.util.*;

public class code10 {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 20};

        // TreeSet removes duplicates and sorts automatically
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Remove the highest element
        set.pollLast();

        // Now last element will be second highest
        int secondHighest = set.last();

        System.out.println("Second Highest Number: " + secondHighest);
    }
}
