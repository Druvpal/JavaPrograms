import java.io.*;

public class readFile {
    public static void main(String[] args) throws IOException {
        
        FileReader obj = new FileReader("C:\\Users\\HARSH NARAYAN PANDEY\\Desktop\\CV.txt");
        int i ;
        while ((i=obj.read())!=-1) {
            System.out.print((char)i);
        }

    }
}
