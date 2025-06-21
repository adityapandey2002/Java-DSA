import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){

//        ArrayList<Integer> arraylist = new ArrayList<>();
//        arraylist.add(4);
//        arraylist.add(80);
//        arraylist.add(90);

//        System.out.println(arraylist.get(1)); // 2nd index = 80
//        System.out.println(arraylist.get(0)); // 1st index = 4

//        System.out.println(arraylist.size());   // 3
//
//        for(int i=0 ; i<arraylist.size() ; i++){     // Here i is pointer
//            System.out.println(arraylist.get(i));   // 4    80  90
//        }
//
//        for(int i : arraylist){                       // Here i itself is element
//            System.out.println(i);                  // 4    80  90
//        }

//        System.out.println(arraylist.contains(80));         // true (return boolean value)

//        ArrayList<Integer> arraylist = new ArrayList<>();
//        arraylist.add(4);
//        arraylist.add(80);
//        arraylist.add(90);
//
//        arraylist.remove(1);        // removes 2nd  element     4   90
//        arraylist.add(100);               // will add at 3rd position   4   90     100
//
//        // if we want to want to insert at a specific index something then we can pass index tooo
//
//        arraylist.add(1, 80); // adds at 1st index and 2nd position 4   80  90  100
//        for (int e: arraylist) {
//            System.out.println(e);      //  4   80  90  100
//        }
//
//        arraylist.set (1, 50) ; // will replace the element
//        System.out.println(arraylist);      // give the array [4, 50, 90, 100]



//         Unlike a regular array, which has a fixed size, an ArrayList can grow and shrink as elements
//         are added or removed. This dynamic resizing is achieved by creating a new array when the current array is
//         full and copying the elements to the new array.

//         When you create an ArrayList, it has an initial capacity (default is 10). The capacity refers
//         to the size of the internal array that can hold elements before needing to resize.

//        Adding Elements to an ArrayList
//        When adding an element to an ArrayList, the following steps occur:
//
//        Check Capacity:
//        Before adding the new element, ArrayList checks if there is enough space in the internal array (elementData).
//                If the array is full, it needs to be resized.
//
//        Resize if Necessary:
//        If the internal array is full, the ArrayList will create a new array with a larger capacity (usually 1.5 times
//        the current capacity) and copy the elements from the old array to the new array.
//
//        Add the Element:
//        The new element is then added to the internal array at the appropriate index, and the size is incremented.

        // we can intialize it with giving some initial capacity too like ;-
        //         ArrayList<Integer> arraylist = new ArrayList<>(150);
        // and if here 151th element will come it become 1.5 times of 150
        // but after it if we start removing the element it will not shrink automatically
        // for shrinking we have to call method trimToSize()


//        ArrayList<Integer> arraylist = new ArrayList<>(150);
//        arraylist.add(4);
//        arraylist.add(80);
//        arraylist.add(90);
//
//
//        arraylist.trimToSize();



////        Creating an ArrayList
////
////        - Default constructor, creates an empty ArrayList with an initial capacity of 10
//        ArrayList list = new ArrayList<>();
//
////
////        - Creating an ArrayList with a specified initial capacity
//        ArrayList listWithCapacity = new ArrayList<>(20);
//
//
////        - Creating an ArrayList from another collection
//        List anotherList = Arrays.asList("Apple", "Banana", "Orange");
//        ArrayList listFromCollection = new ArrayList<>(anotherList);
//        System.out.println(listFromCollection);                         //  [Apple, Banana, Orange]
//
//
////        making a List through aslist doesn't support for add , remove , etc so we will make it into ArrayList
////        and use these methods
////        but .set method works here and it will replace the element
//
//        List<String> listt = Arrays.asList("Apple", "Banana", "Orange");
//        List list2 = new ArrayList<>(anotherList);
//        list2.remove("Apple");
//        System.out.println(list2);              // [Banana, Orange]
//
//
////        making a List through .of doesn't support for add , remove , etc and even .set also
////        so we will make it into ArrayList
//        List<Integer> list3 = List.of(1,2,3);
//        System.out.println(list3);                  // [1, 2, 3]





    }
}
