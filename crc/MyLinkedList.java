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

    public T getIndex (int index){
        if (head==null)throw new ArrayIndexOutOfBoundsException();
        for (int i = 0;i<index;i++){
            head=head.next;

        }
        if (head==null)throw new ArrayIndexOutOfBoundsException();
        return head.value;
    }
    public void delete(int index){
        if (index==0){
            if (head==null)throw new ArrayIndexOutOfBoundsException();
            head=head.next;
        }else {
            Node<T> node = head;
            for (int i = 0 ; i<index-1;i++){
                if (node==null)throw new ArrayIndexOutOfBoundsException();
                node= node.next;
            }
            if (node.value==null)throw new ArrayIndexOutOfBoundsException();
            if (node.next.value==null)throw new ArrayIndexOutOfBoundsException();
            node.next = node.next.next;
        }

    }
}
