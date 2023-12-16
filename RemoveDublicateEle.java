
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicateEle {
    public int  DublicateEle(int arr[]){
        int size = arr.length;
        int c=0;
        Arrays.sort(arr);
        for(int i=1;i<size;i++){
            if(arr[c]!=arr[i]){
                arr[++c] = arr[i];
            }
        }

        return c+1;
        
    }
    public static void main(String[] args) {
        RemoveDublicateEle obj = new RemoveDublicateEle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the size of Arrays :: \t");
        int size = sc.nextInt();
        int arr[] = new int[size];

        
        for(int i=0;i<size;i++){
            System.out.print("Enter the elements of the Arrays :: \t");
            arr[i] = sc.nextInt();
        }

        int length =obj.DublicateEle(arr);
        System.out.println("Length of new Arrys:: \t"+length);

        for(int i=0;i<length;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}
