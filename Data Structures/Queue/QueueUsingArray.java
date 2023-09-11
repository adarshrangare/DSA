package ClassQuestionsAssignments.DSA2.Queue;

public class QueueUsingArray {


        int first =0;
        int rear = 0;

        int [] arr = new int[1001];


        public void add(int a){
            if(rear>=1000){
                System.out.println("Queue is full");
                return;
            }

            arr[rear]= a;
            rear++;
        }
        public int remove(){
            if(first==rear){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[first];
            first++;
            return result;

        }
        public int peek(){
            if(first==rear){
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[first];

        }

        public boolean isEmpty(){
            return first==rear;
        }

        public int getSize(){
//            if(first==rear){
//                return 0;
//            }
            return rear-first;
        }

        public void display(){
            for(int i=first;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    public static void main(String[] args) {

            QueueUsingArray q = new QueueUsingArray();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());

        q.display();





    }

//    1 2 3 4 4 5 6 7 8

}
