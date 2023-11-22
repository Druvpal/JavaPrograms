import java.util.Scanner;

public class countStringvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        int vowel = 0;
        int consonates =0;
        int constant = 0;
        for(int i=0;i<name.length();i++){
            if((int) name.charAt(i) >= 97 && (int) name.charAt(i) <= 122){
                if((int) name.charAt(i) == 97 || (int) name.charAt(i) == 101 || (int) name.charAt(i) == 105 ||(int) name.charAt(i) == 111 || (int) name.charAt(i) == 117){
                    vowel++;
                }
                else{
                    consonates++;
                }
            }
            else{
                constant++;
            }
        }

        System.out.println("Number of Vowels : " + vowel);
        System.out.println("Number of Consonates : " + consonates);
        System.out.println("Number of other Charactor : " + constant);
    }
}
