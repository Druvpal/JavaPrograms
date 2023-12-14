class Arithmetic{
    int add(int x,int y){
        return x+y;
    }
}

class Adder extends Arithmetic{

}

public class Inheritance2 {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println(obj.add(40, 2)+" "+obj.add(10, 13)+" "+obj.add(10, 10));
    }
}
