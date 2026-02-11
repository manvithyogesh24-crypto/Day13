import java.util.*;

public class code14 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("java", "is", "fun", "code");

        Map<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            // If key not present, create new list
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }

            // Add word to respective length list
            map.get(length).add(word);
        }

        // Print result
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
