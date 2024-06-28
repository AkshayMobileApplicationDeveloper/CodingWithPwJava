package DoublyLinkedList;

public class InsertAtHead {
    public static Node insertAtHead(Node head , int x){
        Node tem0= new Node(34);
        tem0.next=head;
        head.prev=tem0;
        head=tem0;
        return head;
    }
}
