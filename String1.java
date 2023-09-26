import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        String name1 = sc.nextLine();
//
//        System.out.println(name);
//        System.out.println(name1);


        // Concatenation
//        String first = "tony";
//        String last = "Manish";
//        String fullname = first + " " + last;
//        System.out.println(fullname);
//
//        for(int i=0;i<fullname.length();i++){
//            System.out.println(fullname.charAt(i));
//        }
//
//        // Compare
//
//        if(first.compareTo(last) == 0){
//            System.out.println("Both string are equal ");
//        }
//        else{
//            System.out.println("Both string are not equal");
//        }
        // Substring
        String sentence = "my name is Tony";
        String name = sentence.substring(0,sentence.length()-4);
        System.out.println(name);

    }
}
