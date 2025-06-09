import java.util.HashMap;
public class hashmap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Add key-value pairs
        map.put("name", "John");
        map.put("age", "25");
        map.put("city", "New York");

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get a value by key
        System.out.println("Name: " + map.get("name"));
    }
}