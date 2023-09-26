import java.util.Scanner;

public class functionSum {
    public static void functionName(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the number :");
        int b = sc.nextInt();

        functionName(a,b);
    }
}
