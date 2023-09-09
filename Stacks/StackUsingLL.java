package ClassQuestionsAssignments.DSA2.Stacks;

public class StackUsingLL {

    class Node{
        String data;
        Node next;

        Node(String data){

            this.data = data;
            this.next = null;
        }

    }

    // Tail/Head is called as Top in Stack
    // Top is last added value;

    Node top;

    // Adding to Stack --> in Push Method

    public void push(String s){

        Node current = this.top;

        Node newNode = new Node(s);

        if(this.top == null){
            this.top = newNode;
            return;
        }

        newNode.next = this.top;

        this.top = newNode;


    }

    // Removing from Stack --> in Pop Method

    public void pop(){

        if(this.top==null){
            System.out.println("Stack is Already Empty");
            return;
        }

        if(this.top.next == null){
            this.top = null;
            return;
        }

        Node topNode = this.top;
        this.top = topNode.next;

        topNode.next = null;


    }

    // Getting topMost Value


    public String getTop() {
        if(this.top == null){

            return "-1";
        }
        return top.data;
    }

    public void printStack(){

        if(this.top==null){
            System.out.println("Stack is Empty");
            return;
        }

        Node topMost = this.top;

        while(topMost!=null){
            System.out.print(topMost.data +" ");
            topMost= topMost.next;
        }


    }


}
