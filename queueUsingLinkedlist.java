public class queueUsingLinkedlist {
    static class Node{
        int data;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static class Queue2{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null & tail == null){
                head = tail = newNode;
                
            }
            else{
                tail.next =newNode;
                tail = newNode;
            }
        }

        // remove the node
        public static int remove(){
            if(head == null){
                System.out.println("Queue is Empty.");
                return -1;
            }
            int val = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return val;
        }

        // peek value
        public static int  peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.add(10);
        q.add(30);
        q.add(20);
        q.add(40);
        q.add(50);

        System.out.println(q.remove());

        q.add(70);
        System.out.println(q.remove());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
