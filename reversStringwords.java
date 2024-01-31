import java.util.Scanner;

public class reversStringwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.next();
        String temp = "";   
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                str1.insert(0, temp);
                str1.insert(0, ".");
                temp="";
                continue;
            }
            temp+=str.charAt(i);
        }
        str1.insert(0, temp);

        System.out.println(str1);


        sc.close();
    }
}
