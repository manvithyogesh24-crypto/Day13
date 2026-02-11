import java.util.*;

public class code8 {
    public static void main(String[] args) {

        String input = "java is powerful and java is fast";

        // Split sentence into words
        String[] words = input.split(" ");

        // Create HashMap to store word frequency
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Print result
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
