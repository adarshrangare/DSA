package LeetCodeQuestions;

public class JumpGameII {
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
        System.out.println(jump(arr));
    }


    public static int jump(int[] nums) {

        int reachable = 0, jumpsCount=0, lastLimit=reachable;
        for(int i=0;i<nums.length-1;i++){

            reachable = Math.max(reachable,i+nums[i]);

            if(i==lastLimit){
                // LastLimit will be updated when current Pointer comes to lastLimit
                lastLimit= reachable;
                // lastLimit will be always the reachable from current Index;
                jumpsCount++;

            }


        }
        return jumpsCount;

    }

}
