package LinkedList;

import java.util.Scanner;


public class NidhiList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        NidhiList obj = new NidhiList();
        Node f = obj.firstNode();
        obj.addNewNodes(f);
        obj.traversal(f);

    }

    public Node firstNode(){

        String firstNode = scan.nextLine();
        return new Node(firstNode);
    }

    public void addNewNodes(Node f){
        Node a = f;
        do {
            System.out.println("What is the next node value you'd like to add.");
            String ans = scan.nextLine();
            while (a.next != null) {
                a = a.next;
            }
            Node temp = new Node(ans);
            a.next = temp;

            System.out.println("Type n to leave.");
        } while (!scan.nextLine().equalsIgnoreCase("n"));
    }

    public void traversal(Node firstNode) {
        Node temp = firstNode;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
