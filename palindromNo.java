import java.util.Scanner;

public class palindromNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int rev_num = 0;

        while (num!=0) {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        System.out.println(rev_num);

        if(num!=rev_num){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
