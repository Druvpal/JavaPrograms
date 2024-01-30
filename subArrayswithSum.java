import java.util.Scanner;

public class subArrayswithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the S value :");

        int s = sc.nextInt();

        System.out.println("Enter the arrays elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false; 
        for(int i=0;i<size-1;i++){
            int count = arr[i];
            for(int j=i+1;j<size;j++){
                if(count>s){
                    j=size;
                    continue;
                }

                if(count==s){
                    System.out.println(i+1 + " "+ j);
                    flag = true;
                    System.exit(0);
                }

                count+=arr[j];

            }
        }

        if(flag==false){
            System.out.println("0");
        }
        sc.close();
    }
}
