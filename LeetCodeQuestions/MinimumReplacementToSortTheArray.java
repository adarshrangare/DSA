class Solution {
    public long minimumReplacement(int[] nums) {

            int n = nums.length;
            long count = 0;
            int previous = nums[n-1];
        
        for(int i=n-2;i>=0;i--){

            if(nums[i]>previous){

                int divison = nums[i]/previous;

                if(nums[i]%previous != 0){

                    divison++;
                }

                previous = nums[i]/divison;

                count+= (divison-1);

            }else{

                previous = nums[i];
            }

        }

        return count;

    }
}
