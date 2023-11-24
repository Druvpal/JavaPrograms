import java.util.Scanner;

public class targetElement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array.");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Array Elements");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element :");
        int target = sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]>= target){
                System.out.println("The index of target element " + target + "is : " + (i));
                break;
            }
        }

        sc.close();

    }
}
