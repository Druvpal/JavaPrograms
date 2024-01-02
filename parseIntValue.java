import java.util.Scanner;

public class parseIntValue {
    public static void main(String[] args) {
        // String str = "123";
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the integer value :: \t");
        // int n = sc.nextInt();


        // Using ParseInt method in Integer class
        int value = Integer.parseInt("100");
        System.out.println("Value is :: "+value);
        

        // Using toString method in Integer class

        String number = Integer.toString(value);
        System.out.println("String value :: "+number);
        sc.close();
    }
}
