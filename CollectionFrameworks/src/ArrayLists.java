import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args){

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(4);
        arraylist.add(80);
        arraylist.add(90);

//        System.out.println(arraylist.get(1)); // 2nd index = 80
//        System.out.println(arraylist.get(0)); // 1st index = 4

        for(int i=0 ; i<arraylist.size() ; i++){
            System.out.println(arraylist.get(i));
        }





    }
}
