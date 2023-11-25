import java.util.Scanner;

public class comprecedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        // a3b5c2a2 == aaaaabbbbbcc
        String name1 = "";
        for(int i=0;i<name.length();i++){
            if((int) (name.charAt(i)) >= 49 && (int) name.charAt(i)<= 57){
                int count = (int)name.charAt(i);
                count = count - 48;
                System.out.println(count);
                while (count>0) {
                    name1 = name1 + name.charAt(i-1);
                    count--;
                }
            }
            
        }

        System.out.println(name1);
    }
}
