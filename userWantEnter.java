import java.util.Scanner;

public class userWantEnter {
    public static void arrayF(int array[]){
        int pos=0,neg=0,zero=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                pos+=array[i];
            }
            else if(array[i]<0){
                neg+=array[i];
            }
            else {
                zero+=1;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("Positive count number is "+pos);
        System.out.println("Negative count number is "+neg);
        System.out.println("Zero count number is "+zero);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        arrayF(array);
    }
}
