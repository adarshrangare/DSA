package ClassQuestionsAssignments.DSA2.Queue;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {

    // It is interview Question

        Stack <Integer> que = new Stack<>();

        Stack <Integer> extra = new Stack<>();

        // enqueue = add
        // dequeue = remove

        public void enqueue(int a){

            que.push(a);

        }

        public int dequeue(){

            while(!que.empty()){

                extra.push(que.pop());

            }
            int firstVal =  extra.pop();

            while(!extra.empty()){

                que.push(extra.pop());

            }
            return firstVal;
        }


        public int peek(){

            while(!que.empty()){

                extra.push(que.pop());

            }
            int firstVal =  extra.peek();

            while(!extra.empty()){

                que.push(extra.pop());

            }
            return firstVal;


        }


        public void printQueue(){
            System.out.println(que);
        }


    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();

        q.dequeue();
        q.printQueue();

        System.out.println(q.peek());



    }



}
