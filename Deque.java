import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<String> name = new ArrayDeque<>();// FIFO
        name.add("Ram");
        name.add("Krishna");
        name.add("Anish");
        name.add("Manish");
        name.add("Anup");
        System.out.println(name);
        // remove the element from the Deque
        name.remove();
        System.out.println(name);
        name.remove();
        System.out.println(name);

    }
}
