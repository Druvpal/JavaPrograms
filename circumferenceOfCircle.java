import java.util.Scanner;

public class circumferenceOfCircle {
    public static void circumferences(int r){
        System.out.println(2*3.45*r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int r = sc.nextInt();
        circumferences(r);
    }
}
