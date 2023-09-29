/*public class copyConstructor {
    int a; String name;
    copyConstructor(){
        
        a = 10; name="Manish";
        System.out.println(a+ " "+name);
    }
    copyConstructor(copyConstructor ref){
        a = ref.a;
        name = ref.name;
        System.out.println(a+" "+name);
    }
}

class copyConstructor1{
    public static void main(String[] args) {
        copyConstructor ref = new copyConstructor();
        copyConstructor ref1 = new copyConstructor(ref);
        System.out.println(ref.a+" "+ref.name);
    }
}*/

class copyConstructor{
    int x,y;
    copyConstructor(int a,int b){
        x=a;y=b;
        System.out.println(x+" "+y);
    }

    copyConstructor(copyConstructor ref){
        x=ref.x; y=ref.y;
        System.out.println(x+" "+y);
    }
}

class copyConstructor1{
    public static void main(String[] args) {
        copyConstructor ref = new copyConstructor(10 , 20);
        copyConstructor ref1 = new copyConstructor(ref);
    }
}