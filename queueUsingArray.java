public class queueUsingArray {
    static class Queue {
        static int arr[];
        static int rear;
        static int size;

        Queue(int size){
            arr = new int[size];
            this.size = size;
            rear = -1;
        }

        static boolean isEmpty(){
            return rear == -1;
        }

        // Add the data into Queue
        static void add(int data){
            if(rear == size -1){
                System.out.println("Queue is full.");
                return;
            }

            rear++;
            arr[rear] = data;
            
        }

        // remove the data from the Queue

        static int remove(){
            if(rear == -1){
                System.out.println("Queue is Empty.");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<size-2;i++){
                arr[i]=arr[i+1];
            }

            rear--;

            return front;
        }

        // Peek method

        static int peek(){
            if(isEmpty()){
                return -1;
            }

            return arr[0];
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
