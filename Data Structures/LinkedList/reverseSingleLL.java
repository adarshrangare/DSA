package ClassQuestionsAssignments.DSA2.LinkedList;

public class reverseSingleLL {




    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        //reverse data iterative
        // reverse data recursive
        //reverse pointer iterative
        // reverse pointer recursive

        int  s= 0;

        while(s++<=8){
            sll.addAtLast(Integer.toString(s));
        }

        sll.printLinkedList();

//        sll.reverseLinkedList();
//        sll.printLinkedList();

        sll.reverseIterate();
        sll.printLinkedList();

        int right = sll.getSize();

    }
}
