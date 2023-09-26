import java.util.Scanner;

public class Pyramidinno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        for(int i=1;i<=n;i++){
            for(int x=1;x<=i;x++){
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }
}
