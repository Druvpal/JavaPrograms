import java.util.Scanner;

public class functionProduct {
    public static void fuctionProduct(int a,int b){
        int product = a*b;
        System.out.println(product);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        System.out.println("Enter the number :");
        int b = sc.nextInt();

        fuctionProduct(a,b);
    }
}
