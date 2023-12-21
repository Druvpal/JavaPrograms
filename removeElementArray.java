
public class removeElementArray {
    public static int remEmt(int arr[],int val){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};

        int val = 2;

        int result = remEmt(arr, val);
        for(int i=0;i<result;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
