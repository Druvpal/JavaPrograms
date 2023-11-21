public class searchLinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        public void addLast(int i) {
        }
    }
    public Node head = null;

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current = newNode;
    }

    public void seachValue(int value){
        Node current = head;
        int count =0;
        while (current.data != value ) {
            current = current.next;
            count++;
        }

        if(count==0){
            System.out.println("Value is not exist in the linkedlist :");
        }
        else{
            System.out.println(count++);
        }
    }
    public static void main(String[] args) {
        Node list = new Node();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        // list.printf();
    }
}
