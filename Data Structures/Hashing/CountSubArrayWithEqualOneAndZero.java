package ClassQuestionsAssignments.DSA2.Hashing;

import java.util.Arrays;

public class CountSubArrayWithEqualOneAndZero {

    public static void main(String[] args) {

        int [] arr = {1,0,0,1,0,1,1};

        // we can replace 0 with -1 and find the count of subarray with sum is ZERO

        for(int i=0;i<arr.length;i++){

            arr[i] = arr[i]==0 ? -1 : 1;


        }



        ZeroSumSubArrays.findTheCountOfZeroSubArrays(arr);

    }

}
