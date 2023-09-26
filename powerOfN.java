import java.util.Scanner;

public class powerOfN {
    public static void powerOfN(int x,int n){
        int pow=1;
        for(int i=1;i<=n;i++){
            pow=pow*x;
        }
        System.out.println(pow);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Number :");
        int x = sc.nextInt();
        int n = sc.nextInt();
        powerOfN(x,n);

    }
}
