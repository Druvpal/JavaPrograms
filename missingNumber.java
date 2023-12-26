import java.util.*;
public class missingNumber {
    public static int MissingN(int[] nums){
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays :: \t");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Arrays Elements :: \t");
        for(int i=0;i<size;i++){
            System.out.print("Enter the element :: \t");
            arr[i]  = sc.nextInt();
        }

        System.out.println(MissingN(arr));

    }
}
