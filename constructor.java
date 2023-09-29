public class constructor {
    int a; String name;
    //using default Constructor
    constructor(){
        a = 10; name = "Manish";
    }
    void show(){
        System.out.println(a+ " " + name);
    }

}

class constructor1 {
    public static void main(String[] args) {
        constructor x = new constructor();
        //System.out.println(a + " "+name);
        x.show();
    }
}
