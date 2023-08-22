

public class JumpGame {
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] arr) {

        int reachable = 0;

        for(int i=0;i<arr.length;i++){
            if(i>reachable) return false;
            reachable = Math.max(reachable,i+arr[i]);

        }
        return true;
    }
}
