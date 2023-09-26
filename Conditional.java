import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the first number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Numbers are equal");
        } else if (a > b){
            System.out.println("a is greater than b ");
        } else {
            System.out.println("b is greater than a ");
        }
    }
}
