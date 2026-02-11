import java.util.LinkedHashMap;

public class code3 {
    public static void main(String[] args) {

        // Create a LinkedHashMap object called capitalCities
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();

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
