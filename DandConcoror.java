import java.util.Scanner;

public class DandConcoror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
            System.out.println(num/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
