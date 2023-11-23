import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.nextLine();

        String nam1 = "";
        int size = name.length();
        for(int i=name.length()-1;i>=0;i--){
            nam1 = nam1 +  name.charAt(i);
        }

        // System.out.println(nam1);
        // System.out.println(name);

        if(nam1.equals(name)){
            System.out.println("The string is palindrome.");
        }
        else{
            System.out.println("The string is not palindrome.");
        }
        sc.close();
    }
    
}