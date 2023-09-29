public class parametoriesdConstroctor {
    int x,y;
    parametoriesdConstroctor(int a,int b){
        x = a; y = b;
    }
    parametoriesdConstroctor(int a, String name){
        System.out.println(a+" "+name);
    }
    void show(){
        System.out.println(x+" "+y);
    }
}

class parametoriesdConstroctor1{
    public static void main(String[] args) {
        parametoriesdConstroctor r = new parametoriesdConstroctor(100, 200);
        parametoriesdConstroctor p = new parametoriesdConstroctor(300, "anish");
        r.show();
        
    }
}
