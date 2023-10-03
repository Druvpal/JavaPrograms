class A{
    void input(){
        System.out.println("Enter Your Name : ");
    }
}

class B extends A{
    void show(){
        System.out.println("My name is Manish.");
    }
}

class C extends A{
    void disp(){
        System.out.println("My name is Ankush.");
    }
}

class hii{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.input(); b.show();
        c.input(); c.disp();
    }
}