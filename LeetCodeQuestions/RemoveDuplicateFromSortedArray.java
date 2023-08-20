package LeetCodeQuestions;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[]nums){

        int idx = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){

            if(nums[i] != nums[idx]){

                nums[++idx] = nums[i];

            }

        }
        return idx+1;
    }
    public static void main(String[] args) {

        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(nums));

        int k = removeDuplicates(nums);

        for(int i=0;i<=k;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
