package ClassQuestionsAssignments.DSA2.Stacks;

import java.util.*;

public class Question1Stack {

//    https://my.newtonschool.co/playground/code/ntpx0bwvpkdc
//    Problem Statement
//    Given an array A, find the nearest smaller element S[i] for every element A[i] in the array such that
//    the element has an index smaller than i.
//    Input:
//5
//4 5 2 10 8
//
//Output:
//-1 4 -1 2 2


    public static  int[] rightLowerValue(int[]array){

        int n = array.length;

        int [] arr = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!st.empty() && st.peek() > array[i] ){

                st.pop();

            }

            if(st.isEmpty()){
                arr[i] = -1;
            } else{
                arr[i] = st.peek();
            }

            st.push(array[i]);




        }
        return arr;

    }

    public static int[] rightGreaterValue(int[] array){

        int n = array.length;

        int [] arr = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!st.empty() && array[i] > st.peek()){

                st.pop();

            }

            if(st.empty()){
                arr[i] = -1;
            } else{
                arr[i] = st.peek();
            }
            st.push(array[i]);
        }
        return arr;

    }



    public static int[] leftGreaterValue(int[] array){
        int n = array.length;

        int [] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){


            while(!st.empty() && st.peek() < array[i]){

                st.pop();

            }

            if(st.empty()){
                arr[i] = -1;
            } else{

                arr[i] = st.peek();

            }


            st.push(array[i]);


        }





        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        int [] arr2 = new int[n];



        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }



        for(int i=0;i<n;i++){

            int temp = arr[i];

            while(!st.empty() && st.peek() > arr[i]){

                st.pop();

            }

            if(st.empty()){
                arr[i] = -1;
            } else{

                arr[i] = st.peek();

            }


            st.push(temp);


        }

        System.out.println(Arrays.toString(arr));


        System.out.println(Arrays.toString(leftGreaterValue(arr2)));

        System.out.println(Arrays.toString(rightGreaterValue(arr2)));

        System.out.println(Arrays.toString(rightLowerValue(arr2)));

    }
}

// -1 4 -1