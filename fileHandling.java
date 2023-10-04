import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\HARSH NARAYAN PANDEY\\Desktop\\KD.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("Successfully created new file:");
            }
            else{
                System.out.println("Already exist file:");
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
