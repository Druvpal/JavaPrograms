
import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Manish");
        name.add("Anish");
        name.add("Ankush");
        name.add("Anup");
        System.out.println(name);
        // insert the name in meddil
        name.add(0,"Ram");
        System.out.println(name);
        // remove the element
        name.remove(1);
        System.out.println(name);
        // swap the element in any position
        name.set(1, " Manish");
        System.out.println(name);
        // print the one element
        System.out.println(name.get(0));
        //to clear all the elements from the array
        name.clear();
        System.out.println(name);
    }
}
