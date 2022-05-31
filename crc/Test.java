import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(0);
        System.out.println(linkedList.isEmpty());
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        linkedList.delete(0);
        linkedList.delete(0);
        linkedList.print();

        System.out.println("array list");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(8);
        integers.add(7);
        integers.add(3);
        integers.add(2);
        integers.add(2);
        integers.add(3);

        OrderedPair.correction(integers);
        for ( int i = 0 ; i< integers.size();i++){
            System.out.println(integers.get(i));

        }


    }

}
