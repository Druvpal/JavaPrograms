import java.util.Scanner;

public class targetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays : ");
        int size = sc.nextInt();
        int Arr[] = new int[size];

        System.out.println("Enter the Arrays Elements :");

        for(int i=0;i<size;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();

        int count = 0;
        int x =1;
        for(int i=0;i<size;i++){
            if(target == Arr[i]){
                count++;
                // flag = false;
                x=i+1;
            }

            if(count==1){
                System.out.println("First Index is "+ i+1);
            }
            else{
                continue;
            }
        }

        if(count == 0){
            System.out.println("Target value does not exist in the arrays :");
        }
        else if(x==1){
            System.out.println("Second Indext does not exist in the arrays :");
        }
        else{
            System.out.println("Last Index is "+ x);
        }

        sc.close();
        
    }
}
