import java.util.Arrays;

public class mergeSortedArray {
    public static void mergeSort(int[] nums1, int m, int[] nums2, int n){
        // if(m==1 & n==0)
        //     System.out.println(arr[0]);
        
        for(int i=m;i<(m+n);i++){
            nums1[i]=0;
        }

        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        // check the first array
        for(int i=0;i<(m+n);i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0};
        int m = 0;
        int brr[] = {1};
        int n = 1;
        mergeSort(arr, m, brr, n);
    }
}
