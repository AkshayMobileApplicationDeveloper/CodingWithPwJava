package DoublyLinkedList;
//
//public class InsertAtAnyNodeInAnyIndex {
//    public static void insertatanypostiiondata(Node head,int position, int value){
//        Node s=head;
//        for(int i =0 ;i<position-1;i++){
//            s.next=s;
//        }
//
//        //s is at position -1
//        Node r = s.next;
//        Node t= new Node (value);
//        //s t r;
//        s.next=t;
//        t.prev=s;
//        t.next=r;
//        r.prev=t;
//    }
//}


public class InsertAtAnyNodeInAnyIndex {
    public static void insertAtAnyPosition(Node head, int position, int value) {
        Node current = head;
        // Handle the case where position is 0 separately
        if (position == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        // Traverse to the node at position - 1
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            // If position is out of bounds
            System.out.println("Position out of bounds");
            return;
        }

        // Create a new node with the given value
        Node newNode = new Node(value);

        // Insert the new node between current and current.next
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }
}

