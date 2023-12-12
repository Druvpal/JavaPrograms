import java.util.Arrays;
import java.util.Scanner;

public class ArrayAllOpreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the Arrays elements :: \t");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
