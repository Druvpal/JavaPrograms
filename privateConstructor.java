//package privateConstructor;
public class privateConstructor {
    int a; double b; String name;
    private privateConstructor(){
        a=10;
        b= 10.55;
        name = "Manish";
        System.out.println(a+" "+b+" "+name);
    }

    public static void main(String[] arg){
        privateConstructor ref = new privateConstructor();
    }
}
