import java.io.*;
import java.sql.SQLOutput;

public class fileReader {
    public static void main(String[] args) {

        try {
            FileReader obj = new FileReader("C:\\Users\\HARSH NARAYAN PANDEY\\Desktop\\CV.txt");
            try {
                int i;
                while ((i = obj.read()) != -1) {
                    System.out.print((char) i);
                }
            }
            finally {
                obj.close();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }


}
