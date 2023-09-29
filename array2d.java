import java.util.Scanner;

public class array2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
