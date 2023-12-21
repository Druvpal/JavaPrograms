public class highestNumber {
    public int highestN(int[] arr,int start){
        if(start==arr.length-1){
            return arr[start];
        }
        int max = highestN(arr, start+1);
        if(max>arr[start]){
            return max;
        }
        else{
            return arr[start];
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,20,30,40,50};
        highestNumber obj = new highestNumber();
        int start =0;
        System.out.println(obj.highestN(arr,start));
    }
}
