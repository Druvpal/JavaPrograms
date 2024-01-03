import java.util.Stack;

public class validParentheses {

    static boolean ValidP(String s){
        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=s.charAt(i)){
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({}{})";
        System.out.println(ValidP(str));
    }
}