import java.util.Scanner;

public class sumOfOdd {
    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }
            else{
                continue;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        sumOfOdd(n);

    }
}
