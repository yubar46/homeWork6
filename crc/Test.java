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


    }

}
