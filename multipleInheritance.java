interface A{
    void show();
}
interface B{
    void disp();

}
class multipleInheritance implements A,B {

    public void show(){
        System.out.println("class A element .");
    }
    public void disp(){
        System.out.println("Class B element.");
    }

    public static void main(String[] args) {
        multipleInheritance ref = new multipleInheritance();
        ref.show(); 
        ref.disp();
    }
}
