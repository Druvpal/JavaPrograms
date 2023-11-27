import java.util.Scanner;

public class stringToDigit {

    public String switchcase(String name){
            switch (name) {
            case "zero": return "0"; 
            case "one": return "1"; 
            case "two": return "2"; 
            case "three": return "3"; 
            case "four": return "4"; 
            case "five": return "5"; 
            case "six": return "6"; 
            case "seven": return "7"; 
            case "eight": return "8"; 
            case "nine": return "9"; 
        
            default:
                break;
            }
            return name;
        }
    public static void main(String[] args) {
        stringToDigit obj = new stringToDigit();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String arr[] = str.split(" ");

        String ans = "";
        System.out.println(arr.toString());
        int i=0;
        while (i>arr.length) {
            if(arr[i] == "double"){
                ans = ans + obj.switchcase(arr[i+1]) + obj.switchcase(arr[i+1]);
                System.out.println(ans);
                i++;
            }
            else if(arr[i] == "triple"){
                ans = ans + obj.switchcase(arr[i+1]) + obj.switchcase(arr[i+1])+obj.switchcase(arr[i+1]);
                System.out.println(ans);
                i++;
            }
            else{
                ans = ans + obj.switchcase(arr[i]);
                System.out.println(ans);
            }
            i++;
        }
        System.out.println(ans);
    }
        

}
