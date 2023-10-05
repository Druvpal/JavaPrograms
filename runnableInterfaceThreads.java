class A implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Runnable Threads.");
                Thread.sleep(1000);
            }
        }
        catch(Exception i){
            System.out.println(i);
        }
    }
}

public class runnableInterfaceThreads {
    public static void main(String[] args) throws Exception{
        A obj = new A();
        //obj.run();
        Thread t = new Thread(obj);
        t.start();

        for(int i=0;i<5;i++){
            System.out.println("Main Threads");
            Thread.sleep(1000);
        }
    }
}
