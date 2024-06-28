package DoublyLinkedList;

import static DoublyLinkedList.InsertAtHead.insertAtHead;
import static DoublyLinkedList.InsertAtTail.insertAtTail;
import static DoublyLinkedList.Node.displayHead;
import static DoublyLinkedList.Node.displayRandom;

public class Main {
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e= new Node(13);

        a.prev=null;a.next=b;
        b.prev=a;b.next=c;
        c.prev=b;c.next=d;
        d.prev=c;d.next=e;
        e.prev=d;e.next=null;
        //calling function

        System.out.println("Print All Node");
        displayHead(a);//displayHead function

        System.out.println("Display Random");
        displayRandom(c);//displayRandom Function

        System.out.println("InsertAtHead");
        Node newHead= insertAtHead(a,34);
        displayHead(newHead);

        System.out.println("InsertAtTail");
        insertAtTail(newHead,90);
        displayHead(newHead);
    }
}
