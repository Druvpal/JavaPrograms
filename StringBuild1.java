import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringBuild1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Manish");
        System.out.println(sb);
        //Char at index 0
        for(int i=0;i<sb.length();i++){
            System.out.print(sb.charAt(i) + " ");
        }
        // set CharAt index 0

        sb.setCharAt(0,'P');
        System.out.println("\n"+sb);

        // Insert

        sb.insert(0,'M');
        System.out.println(sb);
        // Delete
        sb.delete(1,2);
        System.out.println(sb);

        // Append
        // do not append space sb.append("@")
        sb.append('P');
        sb.append('a');
        sb.append('l');
        System.out.println(sb);
    }
}
