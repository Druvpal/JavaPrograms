import java.util.Scanner;

public class CombineString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i=0;i<name.length;i++){
            name[i] = sc.next();
        }

        String Sum="";
        for(int i=0;i<name.length;i++){
            Sum+=name[i]+" ";
        }
        System.out.println(Sum);
    }
}
