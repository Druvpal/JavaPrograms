import java.util.Scanner;

public class avg {
    public static void avgNo(int a,int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("Average Number is "+ avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgNo(a,b,c);
        sc.close();
    }
}
