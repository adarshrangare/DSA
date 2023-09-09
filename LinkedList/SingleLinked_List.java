package ClassQuestionsAssignments.DSA2.LinkedList;

public class SingleLinked_List {
	Node head;



    public class Node {

        String data;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;


        }
    }
		public void addFirst(String data){

            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;

    }

    public void addLast(String data){

        Node newNode = new Node(data);

       if(head==null){

           head = newNode;
           return;

       }
       Node lastNode = head;
       while(lastNode.next != null){

           lastNode = lastNode.next;

       }
		lastNode.next = newNode;
    }

    public void printLinkedList(){

        if(head==null){
            System.out.println("It is empty");
            return;
        }

        Node currentNode = head;

        while(currentNode != null ){

            System.out.print(currentNode.data +"  ");

            currentNode=currentNode.next;
        }
        System.out.println();



    }
    public void deleteFirst(){

        if(head==null){
            System.out.println("It is already Empty");
            return;
        }

        Node firstNode = head;
		head = head.next;
        firstNode.next = null;

    }

    public void deleteLast(){

        if(head==null){
            System.out.println("It is already Empty");
            return;
        }

        Node currentNode = head;
		Node LastNode = currentNode.next;
        while(LastNode.next != null){
            currentNode = currentNode.next;
			LastNode = LastNode.next;

        }

        currentNode.next = null;





    }

    public void deletePosition(int k){

        if(head==null){
            System.out.println("It is empty");
            return;
        }

        Node currentNode = head;
        int pos = 0;
        Node previousNode = null;
        Node nextNode = currentNode.next;
        while(pos++ != k-1 ){



            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.next;


        }

        previousNode.next = nextNode;

    }

    public void addInPosition(int Pos,String Data){

        Node currentNode = head;
        int i = 1;
        Node posNode = new Node(Data);
        Node nextNode = currentNode.next;

        while(  i++ != Pos-1){

            currentNode = nextNode;
            nextNode = currentNode.next;


        }

        currentNode.next = posNode;
        posNode.next = nextNode;



    }

    public static void main(String[] args) {

        SingleLinked_List list = new SingleLinked_List();

		list.addFirst("1");
        list.addLast("2");
        list.addFirst("3");
        list.addLast("4");
        list.addFirst("5");

        list.printLinkedList();

//        list.deleteLast();

        list.printLinkedList();

//        SingleLinked_List empty = new SingleLinked_List();

//        empty.deleteFirst();

        list.deletePosition(3);
        list.printLinkedList();

        list.addInPosition(2,"added");
        list.printLinkedList();

//		list.deletePosition(1);

//        list.addInPosition(10,"added");
        list.printLinkedList();
        list.addInPosition(1,"1st");
        System.out.println();
        list.printLinkedList();
    }


}
