public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(Node<T> next) {
        this.next = next;
        this.value= null;
    }

    public Node(T value, Node<T> next) {
        this.next = next;
        this.value=value;
    }
    public Node() {

    }
}
