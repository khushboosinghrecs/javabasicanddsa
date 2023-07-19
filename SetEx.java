// In Java, the Set interface represents an unordered collection of unique elements. It is a part of the Java Collections Framework and is implemented by several classes, including HashSet, TreeSet, LinkedHashSet, etc
// [10, 20, 20,20, 30]; [10, 20, 30] =>
// add(element): Adds an element to the set.
// remove(element): Removes the specified element from the set.
// contains(element): Checks if the set contains the specified element.
// size(): Returns the number of elements in the set.
// isEmpty(): Checks if the set is empty.
// clear(): Removes all elements from the set.
// addAll(collection): Adds all elements from a collection to the set.
// containsAll(collection): Checks if the set contains all elements from a collection.
// removeAll(collection): Removes all elements from the set that are also present in a collection.
// retainAll(collection): Removes all elements from the set that are not present in a collection.
// iterator(): Returns an iterator to traverse the elements in the set.
// toArray(): Converts the set into an array.
// equals(object): Compares the set with another object for equality.

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

          // Create a HashSet
        Set<String> set = new HashSet<>(); // unsorted manner ,
        Set<Integer> setint = new TreeSet<>(); // sorted manner 
        setint.add(20);
         setint.add(30);
          setint.add(10);  // 10, 20 30
        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println("Set after adding elements: " + set);

        // Check if set contains "Apple"
        boolean containsApple = set.contains("Apple");
        System.out.println("Does set contain 'Apple'? " + containsApple);

        // Remove an element from the set
        set.remove("Banana");
        System.out.println("Set after removing element: " + set);

        // Get the size of the set
        int size = set.size();
        System.out.println("Size of set: " + size);

        // Create a second set
        Set<String> otherSet = new HashSet<>();
        otherSet.add("Apple");
        otherSet.add("Mango");

        // Check if set contains all elements from another set
        boolean containsAll = set.containsAll(otherSet);
        System.out.println("Does set contain all elements from otherSet? " + containsAll);

        // Remove all elements from set that are also present in otherSet
        set.removeAll(otherSet);
        System.out.println("Set after removing elements present in otherSet: " + set);

        // Check if set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty);
        
    }
    
}
