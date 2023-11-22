public class reveseLinkedlist {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void printf(){
        Node current = head;
        while (current !=null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("Null");
    }
    void revers(){

        if(head == null || head.next == null){
            return;
        }
        Node current = head.next;
        Node previ = head;

        while (current!=null) {
            Node nextNode = current.next;
            current.next = previ;

            // update
            previ = current;
            current = nextNode;

        }
        head.next = null;
        head = previ;

    }

    public static void main(String[] args) {
        reveseLinkedlist list = new reveseLinkedlist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        list.printf();
        list.revers();
        list.printf();
    }
}
