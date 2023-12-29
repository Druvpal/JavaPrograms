import java.util.Scanner;

public class powerOfThree {
    public static boolean PowerOT(int n){
        if(n==1){
            return true;
        }

        if(n%3!=0 || n<=0 ){
            return false;
        }

        return PowerOT(n/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :: \t");
        int n = sc.nextInt();
        System.out.println(PowerOT(n));
        sc.close();
    }
}
