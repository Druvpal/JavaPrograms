import org.w3c.dom.ls.LSOutput;

class T{
    void draw4(){
        System.out.println("This message cant readable.");
    }
}
class M extends T{
    void draw() {
        System.out.println("This is class B");
    }
}
public class methodOverloding {
    public static void main(String[] args) {
        T obj = new M();
        obj.draw4();
    }
}
