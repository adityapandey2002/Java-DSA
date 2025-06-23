import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        System.out.println(linkedList);

        linkedList.get(1); // takes O(n) time while lists take O(1) beacuse here have to traverse whole in a loop
                            // in worst case scenario


        linkedList.addLast(49);  // takes O(1)
        linkedList.addFirst(51); // takes O(1)
        System.out.println(linkedList);                 //  [51, 2, 5, 49]

        System.out.println(linkedList.getLast());       //        linkedList.getFirst();
                                                        //        linkedList.getLast();

        System.out.println(linkedList);                 // [51, 2, 5, 49]
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);                 // [51, 5, 49]

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Lion", "Elephant"));
        System.out.println(animals);                       //   [Cat, Dog, Lion, Elephant]
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);                        //  [Cat, Elephant]


    }
}
