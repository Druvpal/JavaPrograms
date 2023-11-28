import java.io.*;
import java.util.*;

public class check {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();



        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            System.exit(0);
        }
        else{
            char arr[] = a.toCharArray();
            char brr[] = b.toCharArray();

            for(int i=0;i<a.length();i++){
                if((int)arr[i] < 97){
                    int temp = (int)arr[i] + 32;
                    arr[i] = (char)temp;
                }
                else if ((int)brr[i] < 97){
                    int temp = (int)brr[i] + 32;
                    brr[i] = (char)temp;
                }
                else {
                    continue;
                }
            }

            Arrays.sort(arr);
            Arrays.sort(brr);
//            System.out.println();



            boolean flag = false;
            for(int i=0;i<a.length();i++){
                if(arr[i] == brr[i] ){
                    flag = true;
                    System.out.println(arr[i] + " " + brr[i]);
                }
                else{
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
}