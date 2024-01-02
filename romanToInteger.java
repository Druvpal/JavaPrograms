import java.util.Scanner;

public class romanToInteger {
    static int value(char b){

        if(b=='I'){
            return 1;
        }
        else if(b=='V'){
            return 5;
        }
        else if(b=='X'){
            return 10;
        }
        else if(b=='L'){
            return 50;
        }
        else if(b=='C'){
            return 100;
        }
        else if(b=='D'){
            return 500;
        }
        else if(b=='M'){
            return 1000;
        }

        return 0;
    }
    static int RomanToI(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            int x=value(s.charAt(i));
            
            int y;
            if(i<s.length()-1 && x<(y=value(s.charAt(i+1)))){
                
                result-=x;
                
            }
            else{
                
                result+=x;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman Value :: \t");
        String roman = sc.next();
        System.out.println("Roman integer values is :: "+RomanToI(roman));

        sc.close();
    }
}
