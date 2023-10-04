import java.io.FileWriter;
import java.io.*;

class writeInFile {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("C:\\Users\\HARSH NARAYAN PANDEY\\Desktop\\KD.txt");
            try{
                obj.write("Java Programming is the best Language...!");
            }
            finally {
                obj.close();
            }
            System.out.println("Created file Successfully wrote ...");
        }
        catch (IOException i){
            System.out.println(i);
        }
    }
}
