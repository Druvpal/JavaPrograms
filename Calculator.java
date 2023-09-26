import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter b number :");
        int b = sc.nextInt();
        System.out.println("Enter the button :");
        int button = sc.nextInt();
        switch (button){
            case 1:{
                int addition = a+b;
                System.out.println(addition);
                break;
            }
            case 2:{
                int substract = a-b;
                System.out.println(substract);
                break;
            }
            case 3:{
                int multiplication = a*b;
                System.out.println(multiplication);
                break;
            }
            case 4: {
                int divition = a / b;
                System.out.println(divition);
                break;
            }
            case 5:{
                int modulo = a%b;
                System.out.println(modulo);
                break;
            }
            default :{
                System.out.println("Invalid Button");
            }
        }
    }
}
