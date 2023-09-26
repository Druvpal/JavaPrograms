import java.util.Scanner;

public class fuctionFactorial {
    public static void funFactorial(int n){
        int sum = 1;
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=n;i>0;i--){
            sum=sum*i;
        }
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        funFactorial(n);

    }
}
