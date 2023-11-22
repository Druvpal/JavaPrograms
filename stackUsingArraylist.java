import java.util.ArrayList;
import java.util.*;

public class stackUsingArraylist {
    public static class Stack {
        
        static  ArrayList list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }
        
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = (int) list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int  peek(){
            if(isEmpty()){
                return -1;
            }
            return (int) list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stackUsingArraylist.Stack s = new Stack();
        s.push(10);
        s.peek();
        s.push(20);
        s.peek();
        s.push(30);
        s.peek();
        s.push(40);
        s.peek();




    }
}
