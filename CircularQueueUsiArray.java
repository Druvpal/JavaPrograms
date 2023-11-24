// import queueUsingArray.Queue;    

// import queueUsingArray.Queue;

public class CircularQueueUsiArray {
    public static class Queue1{
        static int arr[];
        static int rear =-1;
        static int front =-1;
        static int size ;

        Queue1(int size){
            arr =new  int[size];
            this.size = size;
        }

        static boolean isEmpty(){
            if(front ==-1 && rear == -1){
                System.out.println("Queue is Empty.");
                return true; 
            }
            return false;
        }

        static boolean full(){
            return rear+1 == size;
        }

        // Add element 
        static void add(int data){
            if(full()){
                System.out.println("Queue is overflow.");
                return;
            }
            
            if(isEmpty()){
                front++;
            }
            rear = (rear +1) % size;
            arr[rear] = data;

        }

        static int  remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }

            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front+1) % size;
            }

            return res;
            
        }

        static void peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
            }
            else{
                System.out.println(arr[front]);
            }
        }
    }
    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q.remove());

        q.add(60);
        System.out.println(q.remove());

        q.add(70);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
