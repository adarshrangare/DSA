package ClassQuestionsAssignments.DSA2.Queue;

public class QueueUsingLL {

//    It works on FIFO (First In First Out)
        Node front;
        // It is head



        class Node{

            String data;
            Node next;
            Node(String s){
                this.data = s;
                this.next = null;
            }
        }

        public void add(String s){

            Node current = this.front;
            Node newNode = new Node(s);

            if(front == null){
                front = newNode;
                return;
            }

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;


        }

        public void remove(){
            // In Queue Value always Removes from first Position as FIFO

            if(this.front != null)
            this.front = this.front.next;
            else
                System.out.println("It is Already Empty");

        }


        public String peek(){
            // It gives front value of Queue

            if(this.front == null){
                return "It is Empty";

            }

            return front.data;
        }

        public void printQueue(){

            Node current = this.front;

            while(current != null){
                System.out.print(current.data+" ");
                current = current.next;
            }

            System.out.println();

        }


    public static void main(String[] args) {

            QueueUsingLL q = new QueueUsingLL();
        QueueUsingLL qe = new QueueUsingLL();

            q.add("1");
            q.add("2");
            q.add("3");
            q.add("4");
            q.printQueue();
            q.remove();
            q.printQueue();

        System.out.println(qe.peek());




    }


}
