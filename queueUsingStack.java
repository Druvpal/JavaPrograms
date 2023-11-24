import java.util.Stack;

public class queueUsingStack {
    public static Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove 
        static int remove(){
            if(!isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }

            return s1.pop();
        }


    }

    public static void main(String[] args){
        
    }
}
