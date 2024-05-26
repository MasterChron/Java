package Quene;

import java.util.Scanner;

public class Queue {
    static int front, rear, capacity;
    static int[] queue;

    Queue(int size){
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    void queueDeque(){
        if (front == rear){
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = 0; i < queue.length - 1; i++){
            queue[i] = queue[i + 1];
        }

        if (rear < capacity){
            queue[rear] = 0;
        }
        rear--;
    }

    void queueEnque(int item){
        if (rear >= capacity){
            System.out.println("Queue is full.");
            return;
        }

        queue[rear] =  item;
        rear++;
    }

    void peak(){
        System.out.println("Peak of queue is: " + queue[0]);
    }

    boolean isFull(){
        return rear == capacity;
    }

    boolean isEmpty(){
        return rear == 0;
    }

    public static void main(String[] args) {
       Queue queue = new Queue(4);
       System.out.println("Is queue empty: " + queue.isEmpty());
       for (int i = 1; i <= 3; i++){
           queue.queueEnque(10 * i);
       }
       queue.queueEnque(50);

       System.out.println("Is queue full: " + queue.isFull());

       queue.queueEnque(90);

       queue.queueDeque();
       queue.queueDeque();

       queue.peak();

       Scanner scanner = new Scanner(System.in);
       while (!queue.isFull()){
           queue.queueEnque(Integer.parseInt(scanner.nextLine()));
       }
       queue.queueEnque(0);
    }
}
