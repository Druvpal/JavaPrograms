// import LL.Node;

public class LL1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;

    public void Fistadd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last 
    public void Lastadd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next!=null) {
            current = current.next;
        }

        current.next = newNode;

    }
    public void deleteFirst(){
        Node current = head.next;
        head = current;

    }

    public void deleteLast(){
        Node current = head;
        Node current1 = head.next;

        while (current1.next!=null) {
            current = current.next;
            current1 = current1.next;
        }

        current.next = null;
    }
    // Printf Function
    public void printf(){
        Node current = head;
        while (current!=null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Run | Debug 
    public static void main(String[] args) {
        LL1 list = new LL1();
        // list.Fistadd(10);
        // list.Fistadd(20);
        // list.Fistadd(30);
        // list.Fistadd(40);
        // list.Fistadd(50);
        // list.printf();

        list.Lastadd(10);
        list.Lastadd(20);
        list.Lastadd(30);
        list.Lastadd(40);
        list.Lastadd(50);
        list.printf();

        list.deleteFirst();
        list.printf();

        list.deleteLast();
        list.printf();

    }
}
