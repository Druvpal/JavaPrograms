import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class unionOfTwoArray {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first array size :");
        int n = sc.nextInt();
        System.out.print("Enter the second array size : ");
        int m = sc.nextInt();

        Vector<Integer> v1 = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>();

        System.out.println("Enter the first vector elements : ");
        for(int i=0;i<n;i++){
            v1.add(sc.nextInt());
        }

        System.out.println("Enter the second vector elements : ");
        for(int i=0;i<m;i++){
            v2.add(sc.nextInt());
        }

        System.out.println("Sort the vectors :");
        Collections.sort(v1); 
        Collections.sort(v2);


        System.out.println("Remove the repeatation for fist vector: ");
        for(int i=0;i<n-1;i++){
            if(v1.get(i)==v1.get(i+1)){
                v1.remove(i);
            }
        }

        System.out.println("Remove the repeatation for second vector: ");
        for(int i=0;i<m-1;i++){
            if(v2.get(i)==v2.get(i+1)){
                v2.remove(i);
            }
        }
        int count=0;
        if(v1.size()>v2.size()){
            for(int i=0;i<v2.size();i++){
                if(v1.get(i)==v2.get(i)){
                    count++;
                }
                else{
                    count+=2;
                }
            }

            count+=v1.size()-v2.size();
        }
        else{
            for(int i=0;i<v1.size();i++){
                if(v1.get(i)==v2.get(i)){
                    count++;
                }
                else{
                    count+=2;
                }
            }

            count+=v2.size()-v1.size();
        }


        System.out.println(count);

        sc.close();
    }
}
