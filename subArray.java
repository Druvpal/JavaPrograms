import java.util.Scanner;
public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the Array elements :");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Count the sub negative Array
        int Count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i;j++){
                int sum = 0;
                for(int k=0;k<=i;k++){
                    sum += arr[j+k];
                }

                if(sum<0){
                    Count++;
                }
            }
        }

        System.out.println(Count);
    }
}
