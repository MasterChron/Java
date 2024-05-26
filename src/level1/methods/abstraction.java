package level1.methods;

public abstract class abstraction{
    abstract void run();
}
class Honda4 extends abstraction{
    void run(){System.out.println("running safely");}
    public static void main(String args[]){
        abstraction obj = new Honda4();
        obj.run();
    }
}
