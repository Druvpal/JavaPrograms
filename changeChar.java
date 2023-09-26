import java.util.Scanner;

public class changeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i=0;i<size;i++){
            name[i] = sc.next();
            String name1 = "";
            for(int j=0;j<name[i].length();j++){
                if(name[i].charAt(j) == 'e'){
                    name1 +='i';
                }
                else{
                    name1 +=name[i].charAt(j);
                }
            }
            name[i]=name1;
        }
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

    }
}
