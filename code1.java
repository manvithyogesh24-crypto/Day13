import java.util.TreeMap;

public class code1 {
    public static void main(String[] args) {

        // Create a TreeMap object called capitalCities
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
