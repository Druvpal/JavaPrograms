public class compileTimePoly {
    public void showDetails(){
        System.out.println("Manish Kumar Pal");
    }
    public void showDetails(String add){
        System.out.println("Manish address is "+add);
    }
    public static void main(String[] args) {
        compileTimePoly obj = new compileTimePoly();
        obj.showDetails();
        obj.showDetails("Ramnagar");
    }
}
