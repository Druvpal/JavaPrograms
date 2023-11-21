public class LL {
    //Node head;
    class Node {
        String data ;
        Node next;
        // Node head;
        
        Node (String data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;

    public void addFirst(String data){
        Node newNode = new Node(data);
        // boolean head;
        if(head == null){
            head = newNode;
            return;
        }
        Node curentNode = head;
        while (curentNode.next!=null) {
            curentNode = curentNode.next;
        }
        curentNode.next = newNode;
    }

    public void printf(){
        Node newN = head;

        while (newN!=null) {
            System.out.print(newN.data + " ");
            newN = newN.next;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hii ");
        list.addFirst("Manish");
        list.addFirst("Kumar");
        list.addFirst("Pal");
        list.printf();
    }
}
