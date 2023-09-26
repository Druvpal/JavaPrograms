import java.util.Scanner;

public class ageForVote {
    public static void ageForVote(int age){
        if(age>18){
            System.out.println("Age is eligible for Vote.");
        }
        else {
            System.out.println("AGe is not eligible for Vote.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        ageForVote(age);
    }
}

