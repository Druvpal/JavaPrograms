import java.util.ArrayList;
import java.util.Scanner;

public class reverArrayUsiRecursion {
    public static void reverse(int list[], int size, int i){
        if(i>size-1){
            return ;
        }
        reverse(list, size, i+1);
        System.out.print(list[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // ArrayList list = new ArrayList<>();

        System.out.println("Enter the Array Size :");
        int size = sc.nextInt();
        int list[] = new int[size];
        System.out.println("Enter the Arrays Elements :");
        for(int i=0;i<size;i++){
            list[i] =sc.nextInt();
        }   

        reverse(list, list.length, 0);

        // System.out.println(list);
    }

}
