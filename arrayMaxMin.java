import java.util.Scanner;

public class arrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i];
            }

        }
        System.out.println("Max is :"+ max);
        System.out.println("Min is :"+min);
    }
}
