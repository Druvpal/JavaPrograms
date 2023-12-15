import java.util.Scanner;

public class Array2dDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Arrays Element 6X6 :: \t");
        int arr[][] = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // perform the operation
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum2d = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; 
                
                if(sum2d>maxSum){
                    maxSum = sum2d;
                }
            }
        }

        System.out.println("Enter the Max Value's :: \t"+maxSum);

    }
}
