package Stacks;

import LinkedList.Node;

public class Stack<T> {

        private Node<T> node;

        public Stack(T firstValue){
            node = new Node<>(firstValue);
        }

        void push(T value){
            Node temp = node;
            while (temp.next != null){
                temp = temp.next;
            }

            temp.next = new Node<>(value);
        }

        String pop(){
            Node temp = node;
            while (temp.next.next != null){
                temp = temp.next;
            }
            String tempData = temp.next.data.toString();
            temp.next = temp.next.next;
            return tempData;
        }

        int size(){
            Node temp = node;
            int size = 0;
            while (temp.next != null){
                size++;
                temp = temp.next;
            }
            return size;
        }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(1);
        stack.push(1);
        stack.push(8);
        stack.push(9);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
