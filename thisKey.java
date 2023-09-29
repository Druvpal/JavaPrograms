public class thisKey {
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
