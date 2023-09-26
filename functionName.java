import java.util.Scanner;

public class functionName {
    public static void fuctioName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.next();
        fuctioName(name);

    }
}
