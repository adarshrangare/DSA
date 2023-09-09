package ClassQuestionsAssignments.DSA2.Stacks;

import java.util.Stack;

public class StackUsingCollection {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);
        // Top value can be get via "peek" method
        System.out.println("TOP MOST VALUE: "+stack.peek());




    }
}
