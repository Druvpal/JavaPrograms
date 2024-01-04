public class indexOfFirstOccurence {
    static int IndexOf(String haystack, String needle){
        int result = -1;
        int l1 = haystack.length();
        int l2 = needle.length();
        for(int i=0;i<l1-l2+1;i++){
            String temp = haystack.substring(i, i+l2);
            if(temp.equals(needle)){
                return i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println("First index is :: "+ IndexOf(haystack, needle));
    }
}
