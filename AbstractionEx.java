abstract class Vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Stopped");
    }
    }
    class car extends Vehicle{
        void start(){
            System.out.println("Car started");
        }
    }
    public class AbstractionEx {
    public static void main(String[] args) {
        Vehicle v=new car();
        v.start();
        v.stop();
    }
}