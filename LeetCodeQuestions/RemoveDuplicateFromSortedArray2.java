package LeetCodeQuestions;

import java.util.Arrays;
//
//Intuition
//        In this solution, we're iterating through the array once. We maintain an index variable that points to the position where the next unique element should be placed. If the current element is not equal to the element at index - 2, it means we haven't encountered this element twice yet, so we can include it in the result array.
//
//        Approach
//        This approach works because we're allowed to keep up to two duplicates. If there are more than two duplicates, the elements that are allowed to remain in the array are those that are not equal to the element at index - 2, ensuring that only two duplicates are present.
//


public class RemoveDuplicateFromSortedArray2 {
    public static int removeDuplicates2(int[]nums){
        int idx = 2;
        int count =0;
        int n = nums.length;

        for(int i=2;i<n;i++){

            if(nums[i] != nums[idx -2]){
                nums[idx++] = nums[i];
            }


        }

        return idx;

    }
    public static void main(String[] args) {

        int [] nums = {0,0,1,1,1,1,2,3,3};

        System.out.println(Arrays.toString(nums));

        int k = removeDuplicates2(nums);

        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
