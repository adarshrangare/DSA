package ClassQuestionsAssignments.DSA2.LinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
	private int size = 0;
    class Node{

        String data ;
        Node next;
		Node previous;
        Node(String data){ // Constructor
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    public void addAtFirst(String s){

        Node newNode = new Node(s);

        if(head==null){
            this.tail = newNode;
        } else{
            newNode.next = this.head;
            this.head.previous = newNode;
        }
        this.head = newNode;
		size++;

    }

    public void addAtLast(String s){

        Node newNode = new Node(s);

        if(head == null){

            this.head = newNode;
        } else{

            tail.next = newNode;
            newNode.previous = tail;

        }
        this.tail = newNode;
		size++;

    }

    	public int getSize(){
        	return size;
        }

        public void printDoubleList(){

        	Node current = head;

            while(current != null){
                System.out.print(current.data +" ");
                current =  current.next;

            }

            System.out.println();



        }



    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();

        dList.addAtFirst("This");
        dList.addAtFirst("Hello,");
        dList.addAtLast("this");
        dList.addAtLast("is");

		dList.printDoubleList();

    }


}
