import java.util.Scanner;

public class countingBits {
    static void CountingB(int n){
        int[] ans = new int[n+1];
        ans[0]=0;
        int put=1;
        for(int i=1;i<=n;i++){
            int k =0;
            int arr[] = new int[1000];
            int value=i;
            while(value>0){
                arr[k]=value%2;
                value = value/2;
                k++;
            }
            int count=0;
            for(int j=0;j<k;j++){
                count+=arr[j];
            }

            ans[put]=count;
            put++;

        }

        for(int i=0;i<n+1;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n :: \t");
        int n = sc.nextInt();
        CountingB(n);
    }
}
