import java.util.Scanner;

public class greaterNo {
    public static void greaterNo(int a,int b){
        if(a>b){
            System.out.println(a + "is greater than "+b);
        }
        else {
            System.out.println(b +"is greater than "+a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNo(a,b);

    }
}
