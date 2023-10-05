package anish;
public class userPPackage {
    protected void show(){
        System.out.println("Hello anish.");
    }
    public static void main(String[] args) {
        userPPackage obj = new userPPackage();
        obj.show();
    }
}
