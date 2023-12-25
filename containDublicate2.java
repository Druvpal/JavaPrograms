public class containDublicate2 {
    public static boolean ContainD(int[] nums, int k){
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;k>=Math.abs(i-j);j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(ContainD(arr, k));

    }
}
