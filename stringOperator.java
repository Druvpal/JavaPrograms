public class stringOperator {
    public static void main(String[] args) {
        String str = "Manish";
        //System.out.println(str.toLowerCase());
        //System.out.println(str.toUpperCase());

        String str1 = new String("Manish");
        /*if(str==str1){
            System.out.println("Both are equals Strings.");
        }
        else{
            System.out.println("Both are not equals Strings.");
        }
        if(str.equals(str1)){
            System.out.println("Both are equals Strings.");
        }
        else{
            System.out.println("Both are not equals Strings.");
        }*/

        // For immutable Strings

        str.concat(" Kumar");
        System.out.println(str);

        // for Inmmutable Strings

        str1 = str.concat(" Kumar");
        System.out.println(str1);
    }
}
