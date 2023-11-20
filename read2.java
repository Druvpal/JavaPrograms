import java.io.FileReader;
import java.io.IOException;

public class read2 {
    public static void main(String[] args) throws IOException{
        FileReader sc = new FileReader("C:\\Users\\HARSH NARAYAN PANDEY\\Desktop\\CV.txt");
        int i;
        while ((i=sc.read())!=-1) {
            System.out.print((char)i);
        }
    }
}
