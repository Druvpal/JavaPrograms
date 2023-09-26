import java.util.Scanner;

public class tableOfN {
    public static void tableOfNum(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        tableOfNum(n);
    }
}
