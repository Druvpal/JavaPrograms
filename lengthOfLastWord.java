public class lengthOfLastWord {
    static int LengthOf(String s){
        if(s.length()==1){
            return 1;
        }
        int result = 0;
        int i=0;
        if(s.charAt(s.length()-1) == ' '){
            i=1;
        }
        
        while (s.charAt(s.length()-1-i)!=' ') {
            result++;
        }

        return result;
    }
    public static void main(String[] args) {
        String name = "Manish Kumar Pal";
        System.out.println("Last word length is : "+LengthOf(name));
    }
}
