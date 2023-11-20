import java.util.Arrays;
import java.util.Scanner;

public class frequencyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the String Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        System.out.println("Arrays  Frequeincy");
        for(int i=0;i<size-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                continue;
            }
            else{
                System.out.println(arr[i]+ "        " + count);
                count = 1;
            }
        }
        System.out.println(arr[size-1]+ "        "+ count);
        sc.close();
    }
}
