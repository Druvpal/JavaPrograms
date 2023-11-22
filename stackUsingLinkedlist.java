public class stackUsingLinkedlist {
    public class  Node {
        
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    

    static class Stack{
        public static Node head = null;
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static void pop(){
            head = head.next;
        }

        static void printf(){
            Node current = head;
            while (current!=null) {
                System.out.print(current.data + " -> ");
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();

        stack.printf();
    }
}
