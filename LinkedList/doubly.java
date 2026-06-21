class Node{
    int val;
    Node prev;
    Node next;
    Node(int val,Node prev,Node next){
        this.val=val;
        this.prev=prev;
        this.next=next;
    }
}
public class DoublyLinkedList {

    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
}
public class doubly {
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n2 = new Node(2, n1, null);
        n1.next = n2;
        Node n3 = new Node(3, n2, null);
        n2.next = n3;
        Node n4 = new Node(4, n3, null);
        n3.next = n4;
        Node n5 = new Node(5, n4, null);
        n4.next = n5;
        Node head=n1;
        Node tail=n5;
        
    }
}