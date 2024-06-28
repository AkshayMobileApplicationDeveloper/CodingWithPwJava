package DoublyLinkedList;

public class InsertAtTail {
    public static void insertAtTail (Node head, int x ){
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        // now we are on the tail node

        Node temptail = new Node(x);
        temp.next=temptail;
        temptail.prev=temp;
    }
}
