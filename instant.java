// public class instant {
//     instant(){
//         System.out.println("Hello World");
//     }
//     { // Instant and it is call without object   
//         System.out.println("Hello Manish");
//     }
//     public static void main(String[] args) {
//         instant ref = new instant();
//     }
// }
public class instant{
    int a ; static int b;
    instant(){
        System.out.println("Hello World!");
    }

    static { // Static 
        System.out.println(" "+b);
        // a can not access in static class 
    }

    public static void main(String[] args) {
        instant ref = new instant();
    }

}