import java.util.LinkedList;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
//        Vector<Integer> vector = new Vector<>();
//        vector.add(3);
//        vector.add(5);
//        vector.add(39);
//        System.out.println(vector);         //  [3, 5, 39]
//
//        // Here we get the capacity also (as we aren't able to in LinkedList) using .capacity() method
//
//        System.out.println(vector.capacity());          // 10 , which is initial default capacity here also
//                                                            // as in LinkedLists too

//        // we can set initial capacity here too and after reaching the limit it increases 2x times
//        // not 1.5x times as in LinkedLists
//
//        Vector<Integer> vector1 = new Vector<>(5);
//        vector1.add(3);
//        vector1.add(5);
//        vector1.add(39);
//        vector1.add(30);
//        vector1.add(50);
//        System.out.println(vector1.capacity());                 // 5
//        vector1.add(60);
//        System.out.println(vector1.capacity());                 // 10
//
//        // if we are giving another parameter it will ve capacity increment
//        Vector<Integer> vector2 = new Vector<>(5, 3);
//        // now it will increase by 3 after filling up
//        vector2.add(3);
//        vector2.add(5);
//        vector2.add(39);
//        vector2.add(30);
//        vector2.add(50);
//        System.out.println(vector2.capacity());                 // 5
//        vector2.add(60);
//        System.out.println(vector2.capacity());                 //  now 8
//
//        // creating with another collection
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(3);
//        linkedList.add(30);
//        linkedList.add(300);
//        Vector<Integer> vector3 = new Vector<>(linkedList);
//        System.out.println(vector3);                        // [3, 30, 300]
//
//
//  //      Constructors of Vector (Extracted)
//  //      Vector(): Creates a vector with an initial capacity of 10.
//  //
//  //      Vector(int initialCapacity): Creates a vector with a specified initial capacity.
//  //
//  //      Vector(int initialCapacity, int capacityIncrement): Creates a vector with an initial
//  //      capacity and capacity increment (how much the vector should grow when its capacity is exceeded).
//  //      Vector(Collection<? extends E> c): Creates a vector containing the elements of the specified collection.

//        add(E e): Adds an element at the end.
//
//        add(int index, E element): Inserts an element at the specified index.
//
//                get(int index): Retrieves the element at the specified index.
//
//                set(int index, E element): Replaces the element at the specified index.
//                remove(Object o): Removes the first occurrence of the specified element.
//
//        remove(int index): Removes the element at the specified index.
//
//                size(): Returns the number of elements in the vector.
//
//        isEmpty(): Checks if the vector is empty.
//
//        contains(Object o): Checks if the vector contains the specified element.
//
//        clear(): Removes all elements from the vector.




//        Synchronization and Performance of Vector in Java
//        Thread Safety:
//        Vector methods are synchronized, meaning only one thread can access a Vector at a time. This built-in
//        synchronization makes Vector thread-safe by default.
//
//        Performance Overhead:
//        Synchronization introduces locking and unlocking costs, which can cause significant performance overhead in
//        single-threaded environments.
//        This is because every method call acquires a lock, even when thread safety is not needed.
//
//        Modern Best Practices:
//        In contemporary Java development, ArrayList is usually preferred over Vector when synchronization is not required,
//        due to its better performance. For thread-safe collections, alternatives like CopyOnWriteArrayList or
//        ConcurrentHashMap from the java.util.concurrent package are recommended, as they offer improved concurrency
//        and scalability compared to the legacy Vector class.



    }
}
