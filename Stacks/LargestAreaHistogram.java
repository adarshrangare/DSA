package ClassQuestionsAssignments.DSA2.Stacks;

import java.util.Stack;

public class LargestAreaHistogram {
//    https://leetcode.com/problems/largest-rectangle-in-histogram/description/

    public static int largestRectangleArea(int[] arr) {
        int maxArea=0;
        Stack<Integer> st = new Stack<>();
        int n= arr.length;
        for(int i=0;i<n;i++){

            while(!st.empty() && arr[st.peek()] >= arr[i]){
                int area;
                int indexToProcess =  st.pop();
                if(st.empty()){

                    area = (i - (-1) -1) * arr[indexToProcess];
                } else{
                    area = (i-  (st.peek()) -1) * arr[indexToProcess];
                }


                maxArea = Math.max(area,maxArea);
            }

        st.push(i);
        }

        while(!st.empty()){

            int area;
            int indexToProcess = st.pop();
            if(st.empty()){
                area = (n- (-1) -1) * arr[indexToProcess];
            } else{
                area = (n- (st.peek()) -1) * arr[indexToProcess];
            }

            maxArea = Math.max(maxArea,area);

        }


    return maxArea;

    }


    public static void main(String[] args) {

            int [] heights = {2,1,5,6,2,3};

        System.out.println(largestRectangleArea(heights));

    }

}


