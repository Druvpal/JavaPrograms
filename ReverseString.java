import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder("Manish Pal");

        for(int i=0;i<name.length()/2;i++){
            int front = i;
            int backent = name.length()-1-i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(backent);

            name.setCharAt(front,backChar);
            name.setCharAt(backent,frontChar);
        }

        System.out.println(name);


    }
}
