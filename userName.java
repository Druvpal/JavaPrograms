import java.util.Scanner;

public class userName {
    static void EmailUserName(String email){
        int sublength = email.length()-10;
        String result = email.substring(0, sublength);
        System.out.println("Result ::"+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email :: \t");
        String email = sc.next();

        EmailUserName(email);

        sc.close();
    }
}
