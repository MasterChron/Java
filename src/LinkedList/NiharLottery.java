package LinkedList;

import java.util.Scanner;

public class NiharLottery {

    public static void main(String[] args) {
        Node head = new Node(10);

        choices(head);
    }

    public static void choices(Node head){
        NiharLottery obj = new NiharLottery();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1) AddNumber to the list");
            System.out.println("2) Display list");
            System.out.println("3) Rev Display list");
            System.out.println("4) Quit system");

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    obj.insertAtEnd(head);
                    break;
                case 2:
                    obj.display(head);
                    break;
                case 3:
                    obj.displayRev(head);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Not an option please try again");
                    break;
            }
        }
    }

    public void insertAtEnd(Node head){
        Scanner scanner = new Scanner(System.in);
        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        System.out.println("Add a number?");
        System.out.println("(y/n)");

        if (scanner.nextLine().equalsIgnoreCase("y")) {
            int num = (int) (Math.random() * 1000);

            temp.next = new Node(num);
            temp.next.previous = temp;
        }
    }

    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void displayRev(Node head){
        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }
}
