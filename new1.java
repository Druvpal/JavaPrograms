import java.util.Random;
// import java.util.Scanner;

public class new1 {
    public static int key(int x){
        Random rand = new Random();
        
        return rand.nextInt(x);
    }
    
    public static void main(String[] args) {
        // System.out.println(key());
        System.out.println(key(1000));
    }
}
