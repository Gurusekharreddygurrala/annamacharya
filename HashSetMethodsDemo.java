import java.util.HashSet;

public class HashSetMethodsDemo {
    public static void main(String[] args) {
        // 1. Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add() – Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate, will be ignored

        // 3. Display the HashSet
        System.out.println("Initial Set: " + set);

        // 4. size() – Get number of elements
        System.out.println("Size: " + set.size());

        // 5. contains() – Check if element exists
        System.out.println("Contains Banana? " + set.contains("Banana"));
        System.out.println("Contains Grapes? " + set.contains("Grapes"));

        // 6. remove() – Remove an element
        set.remove("Mango");
        System.out.println("After removing Mango: " + set);

        // 7. isEmpty() – Check if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 8. clear() – Remove all elements
        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Is set empty now? " + set.isEmpty());
    }
}
