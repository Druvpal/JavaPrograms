class simpleInheritance {
    protected int roll; int marks;
    String name ;
    protected void input(){
        System.out.println("Inter the input roll , marks and name: ");
    }
}

class student extends simpleInheritance{
    void disp(){
        roll = 25;
        marks = 75;
        name = "Manish";
        System.out.println(roll+" "+marks+" "+name);
    }
    public static void main(String[] args) {
        student obj = new student();
        
        obj.input();
        obj.disp();
    }
}

