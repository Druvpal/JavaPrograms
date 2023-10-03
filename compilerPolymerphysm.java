public class compilerPolymerphysm {
    void  add(){
        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);
    }

    void add(int a, double y){
        double c = a + y;
        System.out.println(c);
    }

    void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    void add(String name){
        System.out.println("My name is : "+name);
    }

    public static void main(String[] args) {
        compilerPolymerphysm obj = new compilerPolymerphysm();
        obj.add(); obj.add(100,200); obj.add(100,100.39); obj.add("manish");
    }
}
