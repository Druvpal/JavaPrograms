package manish;
class userDPackage{
    private void show(){
        System.out.println("My name is Manish Kumar Pal:");
    }

    public static void main(String[] args) {
        userDPackage obj = new userDPackage();
        obj.show();
    }
}
// for compile (javac -d . class_name.java)
// for run (java package_name.class_name)