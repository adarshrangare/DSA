package ClassQuestionsAssignments.DSA2.LinkedList;

public class CircularLinkedList {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String s){
            this.data = s;
            this.next = null;
        }

    }


    public void addFirst(String s){
        Node newNode = new Node(s);
        if(this.head == null){
            this.head = newNode;
            newNode.next = this.head;
            return;
        }

        	newNode.next = head;
        	head = newNode;


    }

    public void printCLL(){

        Node current = this.head;

        do{
            System.out.print(current.data +" ");

            current = current.next;
        }
        while(current != this.head);




    }


    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst("4");
        cll.addFirst("3");
        cll.addFirst("2");
        cll.addFirst("1");

        cll.printCLL();




    }

}
