import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.*;
import java.lang.Thread;

/* by expanding Thread class */
class fun1 extends Thread{
    public void fun(){
        try {
            for(int i=0;i<=5;i++){
                System.out.println("Anish");
                Thread.sleep(1000);
            }

        }
        catch(Exception i){
            System.out.println(i);
        }
    }
}

public class threads {
    public static void main(String[] args) throws Exception {
        fun1 obj = new fun1();
        obj.fun();

        for(int i=0;i<=5;i++){
            System.out.println("Manish");
            Thread.sleep(1000);
        }
    }
}
