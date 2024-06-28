package DoublyLinkedList;
public class Node {
    int val ;
    Node next;
    Node prev;

    Node (int val ){
        this.val=val;
    }
    //displayHead method
    public static void displayHead(Node head){
        Node  temp =head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.print("\n_____________________________\n");
    }
    //displayRandom method
    public static void displayRandom(Node random){
        Node temp = random;

        // Move to the head node
        while (temp.prev != null) {
            temp = temp.prev;
        }

        // Print the list from the head
        Node current = temp;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.print("\n_____________________________\n");
    }

}

