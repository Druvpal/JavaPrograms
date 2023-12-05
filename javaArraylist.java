import java.util.ArrayList;
import java.util.Scanner;

public class javaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of operations :");
        int operation = sc.nextInt();

        int arr[] = new int[operation];
        int x=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (operation>0) {
            System.out.println("Enter the size of subarray :");
            int size = sc.nextInt();
            arr[x] = size;
            x++;
            
            for(int i=0;i<size;i++){
                System.out.println("Enter the element in the list :\t");
                list.add(sc.nextInt());
            }
            operation--;
            
        }

        System.out.println("Enter the size of query :");
        int query = sc.nextInt();
        for(int i=0;i<query;i++){
            System.out.println("Enter the xth element :\t");
            int xth = sc.nextInt();
            System.out.println("Enter the yth element :\t");
            int yth = sc.nextInt();

            if(yth==0){
                System.out.println("ERROR!");
            }

            if(yth>arr[xth-1] ){
                System.out.println("ERROR!");
            }
            else{
                int element =0;
                for(int j=0;j<xth-1;j++){
                    element+=arr[j];
                }
                element+=yth-1;
                System.out.println(list.get(element));
            }
        }
        sc.close();
    }
}
