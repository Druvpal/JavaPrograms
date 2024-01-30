
import java.util.Scanner;
import java.util.Vector;

public class peekElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Vector : ");
        int size = sc.nextInt();

        Vector<Integer> v = new Vector<>();

        System.out.println("Enter the elements of Vector : ");
        while (size-->0) {
            v.add(sc.nextInt());
        }

        System.out.print("enter the x : ");
        int x = sc.nextInt();
        int count=0;
        for(int i=0;i<v.size();i++){
            if(v.get(i)==x){
                count++;
            }
        }
        
        System.out.println("Frequency of x is : " + count);

        sc.close();
    }
}
