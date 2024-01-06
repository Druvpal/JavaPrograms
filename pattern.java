import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            int temp = i; 
            for(int j=0;j<(2*i)-1;j++){
                if(j==i){
                    temp=temp-2;
                }
                if(j<i){
                    System.out.print(temp++);
                }
                else{
                    System.out.print(temp--);
                }
            }
            System.out.println();
        }
    }
}
