package ClassQuestionsAssignments.DSA2.Stacks;

public class StackUsingArray {

    int top = -1;
    int[]arr = new int[1001];

    public void push(int a){
        if(top==1000){
            System.out.println("Stack Overflow");
            return;
        }

        this.top++;
        arr[top] = a;

    }

    public int getSize(){
        if(top>0){
            return 0;
        }
        return top+1;
    }

    public boolean isEmpty(){
        return top<0;
    }

    public int pop(){

        if(top<0){
            System.out.println("Stack is Empty");
            return -1;
        }
         int  result = arr[top];
         top--;
        return result;

    }

    public int peek(){
        if(top<0){
            System.out.println("Stack is Empty");
            return -1;
        }
        int  result = arr[top];

        return result;

    }


    public void printStack(){

        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {

        StackUsingArray sa = new StackUsingArray();
        System.out.println(sa.isEmpty());
        sa.push(1);
        sa.push(12);
        sa.push(13);
        sa.push(14);
        System.out.println(sa.isEmpty());
        sa.printStack();
        // System.out.println(sa.getSize());

        System.out.println(sa.pop());

        sa.printStack();
        // System.out.println(sa.pop());
        System.out.println(sa.peek());

    }

}


    /*


    Last In first Out
    first in last Out


        5
        4
        3
        2
        1




        1|2|3|4|5


     */
