import java.util.Scanner;

public class factorial1 {
    public int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        factorial1 obj = new factorial1();
        int n = sc.nextInt();
        int x = obj.fact(n);
        System.out.println(x);
    }
}
