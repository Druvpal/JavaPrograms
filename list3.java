import java.util.ArrayList;
import java.util.Scanner;

public class list3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of List :");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the List Elements :");
            list.add(sc.nextInt());
        }
        // Query 
        System.out.println("Enter the size of Query :");
        int query = sc.nextInt();
        while (query-->0) {
            
        }{
            System.out.println("Enter the Query :");
            String name = sc.nextLine().trim();
        
            // String name1 = "Insert";
            if(name.equals("Insert")){
                System.out.println("Enter the xth element :");
                int xth = sc.nextInt();
                System.out.println("Enter the yth element :");
                int yth = sc.nextInt();

                list.add(xth,yth);
            }
            else{
                System.out.println("Enter the xth element :");
                int xth = sc.nextInt();
                list.remove(xth);
            }
        }
        System.out.println(list);
        sc.close();
    }
}
