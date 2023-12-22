public class plusOne {
    public static int[] addOne(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        arr = new int[arr.length+1];
        arr[0] = 1;
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        arr = addOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
