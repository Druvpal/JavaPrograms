package manish;
class packagePrivate {
    private void show(){
        System.out.println("My name is Manish Kumar Pal:");
    }

    public static void main(String[] args) {
        packagePrivate obj = new packagePrivate();
        obj.show();
    }
}
