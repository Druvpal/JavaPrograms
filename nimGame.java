import java.util.Scanner;

public class nimGame {
    public static boolean NimG(int n){
        if(n<4)
            return true;
        else{
            if(n%4==0){
                return false;
            }
            else{
                return true;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :: \t");
        int n = sc.nextInt();

        System.out.println(NimG(n));
        sc.close();

    }
}
