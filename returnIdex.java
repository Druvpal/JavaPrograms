import java.util.Scanner;

public class returnIdex {
    public static int Index(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i+1;
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays :: \t");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the array elements :: \t");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element :: \t");
        int target = sc.nextInt();
        System.out.println(Index(arr,target));



    }
}
