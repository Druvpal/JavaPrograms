import java.util.Scanner;

public class arrayAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();

        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isAscending = false;
            }
        }

        if(isAscending == true){
            System.out.println("The array is sorted in Ascending order. ");
        }
        else{
            System.out.println("The array is not sorted in Ascending order.");
        }
    }
}
