import java.util.Scanner;

public class moveZero {
    public static void MoveZ(int[] nums){
        int n = nums.length;
        int point =0;
        boolean temp = false;
        //find the index of 0 value
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                point=i;
                temp = true;
                break;
            }
        }
        if(temp==false){
            return;
        }
        System.out.println("Point "+point);
        for(int i=1;i<n;i++){
            if(nums[i]!=0 & i>point){
                nums[point]=nums[i];
                System.out.println("Point :: "+point+"  i "+i);
                nums[i]=0;
                point++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays :: \t");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the arrays elements :: \t");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        MoveZ(arr);

        System.out.println("Print the original arrya.......");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
