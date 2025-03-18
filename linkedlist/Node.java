
public class Node {
    int data;
    private Node next;
    int count;

    public Node(int data){
        count=0;
        this.data = data;
        next = null;
    }
    Node head = null;
    Node tail = null;
    private void add(int x ){
       Node newNode= new Node(x);
       if(head == null){
           newNode=head;
           newNode =tail;
       }else {
          tail.next=newNode;
          tail =newNode;
       }
    }


}
