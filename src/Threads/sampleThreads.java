package Threads;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class sampleThreads {
    private String name;

    public String getName(){
        return name;
    }

    public static void main(String[] args) {

        sampleThreads sampleThreads = new sampleThreads();

        c1 threadOne = new c1();
        threadOne.run();
        c2 threadTwo = new c2();
        threadTwo.run();
    }
}

class c1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10;i++){
            System.out.println("The value of K = " + i);
        }
    }
}
class c2 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 10;i++){
            System.out.println("The value of I = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}