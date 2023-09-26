
import java.sql.SQLOutput;
import java.util.*;

public class If_else {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("That is Even ");
        } else {
            System.out.println("That is Odd ");
        }
    }
}
