
import java.util.HashMap;
import java.util.Map;

// In Java, the Map interface represents a collection of key-value pairs, where each key is unique. It is a part of the Java Collections Framework and is implemented by several classes, including HashMap, TreeMap, LinkedHashMap,

/*
put(key, value): Associates the specified value with the specified key in the map.
get(key): Returns the value to which the specified key is mapped, or null if the key is not present in the map.
remove(key): Removes the key-value pair with the specified key from the map.
containsKey(key): Checks if the map contains the specified key.
containsValue(value): Checks if the map contains the specified value.
size(): Returns the number of key-value pairs in the map.
isEmpty(): Checks if the map is empty.
keySet(): Returns a set of all keys in the map.
values(): Returns a collection of all values in the map.
entrySet(): Returns a set of all key-value pairs in the map as Map.Entry objects.
clear(): Removes all key-value pairs from the map.
putAll(map): Copies all key-value pairs from the specified map to the current map.
getOrDefault(key, defaultValue): Returns the value to which the specified key is mapped, or a default value if the key is not present in the map.
replace(key, value): Replaces the value to which the specified key is mapped with the specified value.
replace(key, oldValue, newValue): Replaces the value to which the specified key is mapped with the new value if the current value matches the old value.
compute(key, remappingFunction): Applies the remapping function to the value associated with the specified key and replaces the value with the result.
computeIfAbsent(key, mappingFunction): Computes the value for the specified key using the mapping function and adds it to the map if the key is not already present.
computeIfPresent(key, remappingFunction): Applies the remapping function to the value associated with the specified key if the key is present in the map.
merge(key, value, remappingFunction): Combines the value with the existing value (if any) associated with the specified key using the remapping function. 
*/
public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        System.out.println("Map after adding key-value pairs: " + map);

        // Access the value associated with a specific key
        int value = map.get("Banana");
        System.out.println("Value for 'Banana': " + value);

        // Remove a key-value pair from the map
        map.remove("Apple");
        System.out.println("Map after removing 'Apple': " + map);

        // Check if the map contains a specific key
        boolean containsKey = map.containsKey("Orange");
        System.out.println("Does map contain 'Orange'? " + containsKey);

        // Get the size of the map
        int size = map.size();
        System.out.println("Size of map: " + size);

        // Iterate over the key-value pairs in the mapS
        System.out.println("Key-value pairs in the map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            System.out.println(key + ": " + val);
        }
    }
}

