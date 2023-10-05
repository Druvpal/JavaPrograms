import java.util.LinkedList;
public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Anish");
        name.add("Manish");
        name.add("Ankush");
        name.add("Anup");
        for(String str:name){
            System.out.println(str);
        }
        System.out.println(name);
        // Add element in the first place
        name.addFirst("Ram");
        System.out.println(name);
        // Add element in the last place
        name.addLast("Sita");
        System.out.println(name);
        // Remove element
        name.removeFirst();
        System.out.println(name);
        name.removeLast();
        System.out.println(name);
        name.removeLast();
        name.removeFirst();
        name.remove(1);
    }
}
