interface vehical{
    String name = "TVS"; // Interface + static + public
    int speed = 100;
    default void color(){
        System.out.println("TVS color is RED.");
    }
    void start();
    void stop();

}
class abstractionInterface implements vehical {
    @Override
    public void start(){
        System.out.println("Start(): inset key & press the start button.");
    }

    @Override
    public void stop(){
        System.out.println("Stop(): exit the key.");
    }
    public static void main(String[] args) {
        abstractionInterface ref = new abstractionInterface();
        ref.start(); ref.stop(); ref.color();
        System.out.println(speed);
    }
}
