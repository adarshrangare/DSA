package ClassQuestionsAssignments.DSA2.Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumInWindowOfK {


    public static int [] maxSlidingWindows(int[] arr, int k){

        Deque<Integer> dq = new LinkedList<>();
        int n = arr.length;
        int [] maxArr = new int[n];

        int index = 0;

        for(int i=0;i<k;i++){

            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }

            dq.addLast(i);

        }

        maxArr[index++] = arr[dq.getFirst()];

        for(int i=k;i<n;i++){

            while(dq.getFirst() >= i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[dq.getLast()] < arr[i] ){

                dq.removeLast();

            }

            dq.addLast(i);

          maxArr[index++] = arr[dq.getFirst()];
        }

        return maxArr;
    }

    public static int [] maxSlidingWindow(int[] arr, int k){

        Deque<Integer>dq = new ArrayDeque<>();
        int n = arr.length;
        int [] maxArr = new int[n-k+1];
        int index =0;
        for(int i=0;i<n;i++) {
//            System.out.println(i+" Iteration");

            while(!dq.isEmpty() && dq.getFirst() <= i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && arr[dq.getLast()] < arr[i] ){
//                System.out.println("while(!dq.isEmpty() && arr[dq.getLast()] < arr[i] ): "+ !dq.isEmpty() +" "+arr[dq.getLast()]+ "<" +arr[i] );
                dq.removeLast();
            }
            dq.addLast(i);
            if(i >= n%k)
//                System.out.println(arr[dq.peek()]);
            maxArr[index++] = arr[dq.peek()];

        }
//        System.out.println("Deque: "+dq);
//        System.out.println(arr[dq.peek()]);

//        for(int i=k;i<n;i++){
//
//            while(dq.getFirst() <= i-k){
//                dq.removeFirst();
//            }
//
//
//
//        }

        return maxArr;
    }

//    public static void maxSlidingWindow(int[] arr, int k){
//
//        Deque<Integer>dq = new ArrayDeque<>();
//        int n = arr.length;
//        int [] maxArr = new int[n-k+1];
//        int index = 0;
//        for(int i=0;i<n;i++){
//            System.out.println("Line39 iteration: "+i +" " + dq);
//            if(!dq.isEmpty() && dq.getFirst() <= i-k){
//                dq.removeFirst();
//            }
//            System.out.println("Line43 iteration: "+i  +" " + dq);
//            while(!dq.isEmpty() && arr[dq.getLast()] < arr[i]){
//
//                System.out.println("Removed Last Element because Last Element: "+ arr[dq.getLast()] +" of Deque is smaller than current: "+arr[i]);
//                dq.removeLast();
//
//            }
//
//
//            dq.addLast(i);
//            System.out.println("added Current Element: "+dq.getLast() +"-->"+arr[dq.getLast()]);
//
//            if(i>=k-1){
//                maxArr[index] = arr[dq.getLast()];
//                index++;
//            }
//
//        }
//
//        System.out.println(Arrays.toString(maxArr));
//
//
//    }


    public static void main(String[] args) {

        int [] arr = {1,3,-1,-3,5,3,6,7};
//                        3,3,5,5,6,7
        int k = 3;
//        maxSlidingWindow(arr,k);
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }


}
