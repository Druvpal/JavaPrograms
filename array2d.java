import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int row = sc.nextInt();
        System.out.println("Enter the column of the matrix :");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        int next =11;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = next;
                next++;
            }
        }
        System.out.println("Output of the matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
