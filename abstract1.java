abstract class abstract1 {
    void legs(){
        System.out.println("All animals have four legs.");
    }
    abstract void eat(); // we can not define 
    abstract void sound(); // we can not define 
    
}

class dog extends abstract1
{
    void eat(){
        System.out.println("Dog eats meat .");
    }
    void sound(){
        System.out.println("Dogs sound Bow .. Bow..");
    }
}

class cow extends abstract1{
    void eat(){
        System.out.println("Cow eats grass .");
    }
    void sound(){
        System.out.println("Cow sounds Oooo...Oooo");
    }
}

class animals{
    public static void main(String[] args) {
        dog d = new dog();
        cow c = new cow();

        d.eat(); d.sound(); d.legs();
        c.eat(); c.sound(); c.legs();
    }
}
