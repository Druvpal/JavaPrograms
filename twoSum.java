import java.util.ArrayList;

public class twoSum {
    public static int[] twosum(int arr1[], int target){
        // ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[2];
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(target == arr1[i]+arr1[j]){
                    System.out.println(arr1[i]+arr1[j]);
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int arr1[] = {3,2,3};
        int target = 6;
        int arr2[] = twosum(arr1, target);
        for(int i=0;i<2;i++){
            System.out.println(arr2[i]);
        }
    }
}
