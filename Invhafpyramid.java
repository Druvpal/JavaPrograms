import java.util.Scanner;

public class Invhafpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
