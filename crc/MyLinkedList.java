public class MyLinkedList<T> {

    private Node<T>  head ;

    public MyLinkedList(Node<T> head) {
        this.head = head;
    }

    public MyLinkedList() {
    }

    public MyLinkedList(T value){
        Node node =new Node();
        node.value = value;
        head =node;
    }

    public Node<T> getHead() {  //لارم مشه پاک میشه
        return head;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void print(){
        Node node = this.head;
        while (node!=null){
            System.out.println(node.value.toString());
            node= node.next;
        }
    }

    public void addLast(T value){

        if (isEmpty()){
            Node lastNode = new Node(value);
            head = lastNode;
        }else {

            Node lastNode = head;
            while (lastNode.next!=null){
                lastNode = lastNode.next;
            }
            Node newNode = new Node(value);
            lastNode.next=newNode;
        }

    }

    public boolean contain(T value){
        Node node =this.head;
        while (node!=null){
            if (node.value.equals(value))return true;
            node=node.next;
        }
            return false;
    }
}
