package ClassQuestionsAssignments.DSA2.LinkedList;

public class SinglyLinkedList {

    Node head;
    private int size = 0;

    class Node{
        String data;
        Node next;

        Node(String s){

            this.data = s;
            this.next = null;

        }

    }

    public void addAtFirst(String s){

        Node newNode = new Node(s);
        newNode.next = head;
        head = newNode;
        size++;

    }
    public void addAtLast(String s){

        Node newNode = new Node(s);
		if(head==null){
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;

        while(currentNode.next != null){

            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
		size++;

    }

    public void printLinkedList(){

        if(head==null){
            return;
        }

        Node currentNode = head;

        while(currentNode!=null){
            System.out.print(currentNode.data +" -> ");
            currentNode= currentNode.next;
        }


        System.out.println();
    }


    public void removeFromFirst(){

        Node firstNode = head;
        head = firstNode.next;
        if(size>0){
            size--;
        }

    }

    public boolean isEmpty(){
        return head==null;

    }

    public int getSize(){
        return size;
    }

    public void removeFromLast(){

        if(head==null){
            return;
        }

        Node currentNode = head;
        Node lastNode = currentNode.next;
        while(lastNode.next !=null){
            currentNode = currentNode.next;
            lastNode = lastNode.next;

        }

        currentNode.next = null;
        size--;


    }

    public void insertAtPos(int k,String s){

        Node newNode = new Node(s);

        if(k==0){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        if(getSize()<k){
            return;
        }

		int pos = 0;
        Node currentNode = head;

        while(pos++ != k-1){

            currentNode = currentNode.next;

        }
        Node nextNode = currentNode.next;

        currentNode.next = newNode;
        newNode.next = nextNode;

		size++;
    }

	public void deleteFromPosition(int k){

        if(k==0){
            Node currentNode = head;
            head = currentNode.next;
            if(size>0){
                size--;
            }
           return;
        }

        if(getSize()<=k){
            return;
        }


        Node currentNode = head;
        int pos = 0;
        Node prevNode = currentNode;

        while(pos++ != k){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

//       currentNode.next; is nextNode
        prevNode.next = currentNode.next;


        size--;

    }

    public String getData(int index){

        if(index==0){
            return head.data;
        }
        if(getSize()<=index){
            return "";
        }

        Node currentNode = head;

        int pos = 0;

        while(pos++ != index){

            currentNode = currentNode.next;

        }

        return currentNode.data;



    }

    public void setData(int index,String s){

        if(index==0){
            head.data = s;
            return;
        }

        if(getSize()<=index){
            return ;
        }

        Node currentNode = head;
        int pos = 0;
        while(pos++ != index){

            currentNode = currentNode.next;
        }
        currentNode.data = s;



    }

    public void reverseLinkedList(){

        	int size = getSize();
            size = size/2;

            Node first = head;
			Node last = head;

            while(last.next != null){

                last = last.next;

            }


            while(size-->0){
                String temp = first.data;
                first.data = last.data;
                last.data = temp;

                first = first.next;

            }

            printLinkedList();

    }

    public void reverseIterate(){

        Node prevNode = head;
        Node curNode = head.next;

        if(head==null && head.next==null){
            return;
        }


        while(curNode != null){

            Node nextNode = curNode.next;

            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;


        }

        head.next = null;
        head = prevNode;



    }

    public void reverseRecursively(Node prevNode){


        Node curNode = head.next;




    }


	public void reverseDataRecursive(Node node,int right){

//        if(left>right);

        reverseDataRecursive(node.next,right-1);





    }


    public static Node findMidNode(Node head){

        Node currentSlow = head;
        Node currentFast = head;

        while(currentFast.next != null){

            currentSlow = currentSlow.next;
            currentFast = currentFast.next.next;

        }

		return currentSlow;
    }

    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        System.out.println(sList.isEmpty());

        sList.addAtFirst("1AddedFirst");
        sList.addAtLast("1AddedLast");
        sList.addAtFirst("2AddedFirst");
        sList.addAtLast("1AddedLast");

        sList.printLinkedList();
        System.out.println();
        sList.removeFromFirst();

        sList.printLinkedList();
        System.out.println();
        sList.removeFromLast();

        sList.printLinkedList();

        System.out.println(sList.getSize());

        sList.insertAtPos(10,"InsertAt10Index");
        System.out.println(sList.getSize());

        sList.addAtLast("3AddedLast");
		sList.printLinkedList();
        System.out.println(sList.getSize());
        sList.insertAtPos(3,"Added by Insert at 3rdIndex");

        sList.printLinkedList();
        System.out.println(sList.getSize());

        sList.deleteFromPosition(4);

        sList.printLinkedList();
        System.out.println(sList.getSize());

        System.out.println(sList.getData(4));

        sList.setData(0,"changed 0th Index");

        sList.printLinkedList();
        System.out.println(sList.getSize());

//        sList.reverseLinkedList();

        sList.printLinkedList();

//        sList.reverseIterate();

//        sList.reverseRecursively(sList.head);

//        sList.printLinkedList();

//        System.out.println(sList.head.next.data);

        SinglyLinkedList sll = new SinglyLinkedList();

        int  s= 0;

        while(s++<=8){
            sll.addAtLast(Integer.toString(s));
        }

        sll.printLinkedList();

        Node midNode = findMidNode(sll.head);

        System.out.println(midNode.data);

    }


}
