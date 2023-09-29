/*class A{
    int a=10;
}

class B extends A{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class superKey1 {
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}

class A{
    void show(){
        System.out.println("Hello Manish");
    }
}

class B extends A{
    //int a =20;
    void show(){
        super.show();
        System.out.println("Hello Kallu's");
    }
}

class superKey1{
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
*/
class A{
    int a;
    A(int x){
        a=20;
        System.out.println(a);
    }
}
class B extends A{
    int a =10;
    B(){
        super(20);
        System.out.println(a);
    }
}

class superKey1{
    public static void main(String[] args) {
        B ref = new B();
    }
}