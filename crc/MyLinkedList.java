public class MyLinkedList<T> {

    private Node<T>  head;

    public MyLinkedList(Node<T> head) {
        this.head = head;
    }

    public MyLinkedList() {
    }

    public MyLinkedList(T value){
        this.head.value = value;
    }


}
