
import java.util.*;

public class ProductOfArrayExceptItself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]leftProduct = new int[n];
        int[]rightProduct = new int[n];
        int product = 1;
        for(int i=0;i<n;i++){
            leftProduct[i] = product;
            product *= nums[i];
        }
        product =1;
        for(int i=n-1;i>=0;i--){
            rightProduct[i] = product;
            product *= nums[i];
        }
        int [] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = leftProduct[i] * rightProduct[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int [] result = productExceptSelf(arr);

        System.out.println(Arrays.toString(result));

    }
}
