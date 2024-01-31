import java.util.Scanner;
import java.util.Vector;

public class moveTheallnegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");

        int size = sc.nextInt();

        Vector<Integer> v = new Vector<>();
        System.out.println("Enter the vector elements : ");
        for(int i=0;i<size;i++){
            v.add(sc.nextInt());
        }

        int NoSwap = 0;
        for(int i=0;i<size;i++){
            if(NoSwap==size){
                break;
            }

            NoSwap++;
            int temp = v.get(i);
            if(temp<0){
                v.remove(i);
                v.add(temp);
                i--;
            }
        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(v.get(i) + " ");
        }

        sc.close();

    }
}
