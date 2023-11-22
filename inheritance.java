class inheritance1 {

    int value;
    public void show(int value){
        this.value = value;
        System.out.println("Value is : " + value);
    }
    public void method(int i) {
    }
}

public class inheritance extends inheritance1{
    int data ;

    public void method(int data){
        this.data = data;
        System.out.println(" Data is " + data);
    }

    public static void main(String[] args) {
        inheritance obj = new inheritance();
        obj.method(10);
        obj.show(20);
    }
}

