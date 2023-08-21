class ArrayRotation {
    public void rotate(int[] nums, int k) {
       
       k = k % nums.length;

       // Reverse whole Arrays
       reverse(nums,0,nums.length-1);
       //reverse 0th to k-1
       reverse(nums,0,k-1);
       // reverse kth to last
        reverse(nums,k,nums.length-1);


        

    }

    public void reverse(int[]nums, int left, int right){

        while(left<right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;


        }


    }
}
