/*public class thisKey {
    int a;
    // Using this key word 
    thisKey(int a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        thisKey ref = new thisKey(100);
        ref.show();
    }
}

class thisKey{
    thisKey(){
        System.out.println("Hello Manish");
    }

    thisKey(int a){
        this();
        System.out.println(a);
    }
    public static void main(String[] args) {
        thisKey ref = new thisKey(100);
        //ref.thisKey(100);

    }
}*/

class thisKey{
    thisKey(){
        this(100);
    }
    thisKey(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        thisKey ref = new thisKey();
    }
}


