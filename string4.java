public class string4 {
    public static void main(String[] args) {
    String str =  "Hello India";
    String reverse_str = StringFormatter.reverseString(str);
    System.out.println("Actual String: "+str);
    System.out.println("Reverse String: "+reverse_str);
    }
}
class StringFormatter {
public static String reverseString(String str){
StringBuilder sb=new StringBuilder(str);
sb.reverse();
return sb.toString();
}
}