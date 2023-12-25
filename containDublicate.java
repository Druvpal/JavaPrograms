import java.util.Arrays;

public class containDublicate {
    public static boolean ContainD(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3};

        System.out.println(ContainD(arr));

    }
}
