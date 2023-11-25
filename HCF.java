import java.util.Collections;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // To get HCF

        int flag = a > b ? b : a ;
        System.out.println(flag);
        if(a%flag == 0 & b%flag==0){
            System.out.println("HCF is : " + flag);
            System.exit(0);
        }
        flag = flag/2;
        while((a%flag)!=0 || (b%flag!=0) ){
            flag--;
        }

        System.out.println("HCF is :" + flag);

    }
}
