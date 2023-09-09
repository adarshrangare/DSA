package ClassQuestionsAssignments.DSA2.Deque;

import java.util.*;

public class DequeUsingCollection {
    public static void main(String[] args) {

        Deque <Integer> d = new LinkedList<>();

        for(int i=1;i<10;i++){
            d.addLast(i);

        }

        System.out.println(d);
//        remove() method return the first value and remove it

        System.out.println(d.remove());
        System.out.println(d.removeLast());
        System.out.println(d.removeFirst());


        System.out.println(d.peek());


    }
}
