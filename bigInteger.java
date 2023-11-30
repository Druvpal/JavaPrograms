import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        // a = int (a+b);
        a = a.add(b);
        System.out.println(a);
        a = a.subtract(b);
        a = a.multiply(b);
        System.out.println(a);
        sc.close();
    }
}
