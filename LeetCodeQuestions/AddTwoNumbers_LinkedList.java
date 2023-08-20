package LeetCodeQuestions;

// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers_LinkedList {

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
         l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            ListNode result = addTwoNumbers(l1,l2);
//        ListNode result = l2;
            while(result != null){
                System.out.print("-"+result.val);
                result= result.next;
            }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){


//            2 4 3
//            5 6 4

            ListNode dummyhead = new ListNode();
            ListNode current = dummyhead;

            int carry = 0;

            while( (l1 != null) || (l2 != null) || carry>0){
                int d1 = 0;
                int d2 = 0;
                int sum = 0;
               if(l1 !=null){
                   d1 = l1.val;
                   l1 = l1.next;
               }

               if(l2 != null){
                   d2 = l2.val;
                   l2 = l2.next;
               }

               sum = d1 +d2 + carry;

               carry = sum/10;

               sum = sum%10;

               ListNode newNode= new ListNode(sum);

               current.next = newNode;
               current = current.next;



            }



            return dummyhead.next;


    }


}
