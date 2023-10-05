import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();
        // Push element in the stack
        System.out.println("Push the element in the stack:");
        name.push("Anish");
        name.push("Manish");
        name.push("Anup");
        name.push("Annu");
        name.push("Kallu's");
        // Pop the element from the stack
        System.out.println(name);
        System.out.println("Pop the elements from the stack:");
        name.pop();
        System.out.println(name);
        name.pop();
        System.out.println(name);


    }
}
