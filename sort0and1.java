import java.util.Arrays;
import java.util.Scanner;

public class sort0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];
        
        System.out.println("enter the arrays elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("sorted array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}
