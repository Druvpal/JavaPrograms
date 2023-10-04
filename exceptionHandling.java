public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println("This message Compile:");
        int a=10,b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("This message is ended:");
    }
}
