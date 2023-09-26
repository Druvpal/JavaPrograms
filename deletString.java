import java.util.Scanner;

public class deletString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String gmail[] = new String[size];

        for(int i=0;i<size;i++){
            gmail[i]=sc.next();
            gmail[i]=gmail[i].substring(0,gmail[i].length()-10);
        }
        for(int i=0;i<gmail.length;i++){
            System.out.println(gmail[i]);
        }


//        for(int i=0; i<email.length(); i++) {
//            if(email.charAt(i) == '@') {
//                break;
//            } else {
//                userName += email.charAt(i);
//            }
//        }

    }
}
