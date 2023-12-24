import java.util.Arrays;

public class majorityElement {
    public static int majorityE(int[] nums){
        Arrays.sort(nums);
        int turms = nums.length/2;
        if(nums.length%2==1)
            turms++;
        int count = 1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>=turms){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(majorityE(arr));
    }
}
