public class classObject {
    int age = 23;
    int weight = 65;
    String color = "Light";

    void eat(){
        System.out.println("I am eating.");
    }
    void sleep(){
        System.out.println("I am sleeping.");
    }
    public static void main(String[] args) {
        classObject x = new classObject();
        System.out.println(x.age);
        System.out.println(x.weight);
        System.out.println(x.color);
        x.eat();
        x.sleep();
    }
}
