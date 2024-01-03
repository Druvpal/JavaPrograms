class A{
    public void work(){
        System.out.println("A is working.");
    }
}

class B extends A {
    public void work(){
        System.out.println("B is working.");
    }
}

public class runtimePolymer {
    public static void main(String[] args) {
        A b = new B();
        b.work();
    }
}

