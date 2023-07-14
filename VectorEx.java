import java.util.Vector;


// In Java, the Vector class is a part of the Java Collections Framework and is used to implement dynamic arrays that can grow or shrink in size.

// 1. `add(element)`: Adds an element to the end of the vector.
// 2. `add(index, element)`: Inserts an element at the specified index.
// 3. `addAll(collection)`: Adds all elements from a collection to the vector.
// 4. `get(index)`: Retrieves the element at the specified index.
// 5. `set(index, element)`: Replaces the element at the specified index with a new element.
// 6. `remove(element)`: Removes the first occurrence of the specified element from the vector.
// 7. `remove(index)`: Removes the element at the specified index.
// 8. `clear()`: Removes all elements from the vector.
// 9. `isEmpty()`: Checks if the vector is empty.
// 10. `size()`: Returns the number of elements in the vector.
// 11. `contains(element)`: Checks if the vector contains the specified element.
// 12. `indexOf(element)`: Returns the index of the first occurrence of the specified element.
// 13. `lastIndexOf(element)`: Returns the index of the last occurrence of the specified element.
// 14. `subList(fromIndex, toIndex)`: Returns a sublist of elements within the specified range.
// 15. `toArray()`: Converts the vector into an array.
// 16. `iterator()`: Returns an iterator to traverse the elements in the vector.
// example in java

public class VectorEx {

    // [1, 2, 3, 4, 5 ] => 3
    // 0 ............loength -1
    public static void main(String[] args) {
        Vector<Integer> vectorarr = new Vector<>();
        vectorarr.add(1);
        vectorarr.add(2);
        vectorarr.add(3); 
        vectorarr.add(4); 
         vectorarr.add(5);
         vectorarr.remove(0);
         vectorarr.removeElement(3);
        // itertint traversing 
         for(int ele : vectorarr){
            System.out.println(ele);
         }

        Vector<String> vectorarrStr = new Vector<>();
        vectorarrStr.add("hello");
        vectorarrStr.add("world");
        vectorarrStr.add("java"); 
        vectorarrStr.add("world"); 
         
        for( String str : vectorarrStr){
             System.out.println(str);
        }
           // Create a Vector of integers
           Vector<Integer> vector = new Vector<>();

           // Add elements to the vector
           vector.add(10);
           vector.add(20);
           vector.add(30);
   
           // Get element at index 1
           int element = vector.get(1);
           System.out.println("Element at index 1: " + element);
   
           // Replace element at index 2
           vector.set(2, 40);
           System.out.println("Vector after replacing element: " + vector);
   
           // Check if vector contains 30
           boolean contains = vector.contains(30);
           System.out.println("Does vector contain 30? " + contains);
   
           // Remove element 20
           vector.remove(Integer.valueOf(20));
           System.out.println("Vector after removing element: " + vector);
   
           // Get the size of the vector
           int size = vector.size();
           System.out.println("Size of vector: " + size);
   
           // Convert vector to an array
           Integer[] array = vector.toArray(new Integer[vector.size()]);
           System.out.println("Array created from vector: ");
           for (int num : array) {
               System.out.println(num);
           }


    }
    
}
