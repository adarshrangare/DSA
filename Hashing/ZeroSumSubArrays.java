package ClassQuestionsAssignments.DSA2.Hashing;

import java.util.HashMap;

public class ZeroSumSubArrays {
    public static void main(String[] args) {

//        int [] arr = {1,-2,1,4,-3,-1,5,6,-4,-5};

        int [] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12,-7};

        int [] arr2 = {1,2,3,1,5};
        System.out.println("count of zero Sum SubArray");
        findTheCountOfZeroSubArrays(arr);

        System.out.println("-----------------------");
        System.out.println("Largest length of zero Sum SubArray");
        findTheLongestLengthOfSubArraySumzero(arr);

        System.out.println("-----------------------");

        System.out.println("count of K Sum SubArray");
        findTheCountOfSumKSubArrays(arr2,6);

    }

    private static void findTheCountOfSumKSubArrays(int []arr,int k) {

        int n = arr.length;

        HashMap<Integer,Integer> prefSum = new HashMap<>();

        prefSum.put(0,1);

        int count =0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(prefSum.containsKey(sum-k)){
                count += prefSum.get(sum-k);
            }

            prefSum.put(sum, prefSum.getOrDefault(sum,0)+1);
        }

        System.out.println(prefSum);
        System.out.println(count);


    }

    public static void findTheLongestLengthOfSubArraySumzero(int[] arr) {


        int n = arr.length;

        HashMap<Integer,Integer> prefSum = new HashMap<>();

        prefSum.put(0,-1);

        int length =0;
        int sum =0;

        for(int i=0;i<n;i++){

            sum+=arr[i];

            if(prefSum.containsKey(sum)){

                length = Math.max(length,(i - prefSum.get(sum)));

            }


            prefSum.put(sum,i);



        }

        System.out.println(prefSum);

        System.out.println(length);





    }

    public static void findTheCountOfZeroSubArrays(int[] arr) {

        int n = arr.length;

        HashMap<Integer,Integer> prefSum = new HashMap<>();

        prefSum.put(0,1);

        int count =0;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];

            if(prefSum.containsKey(sum)){
                count += prefSum.get(sum);
            }

            prefSum.put(sum, prefSum.getOrDefault(sum,0)+1);
        }

        System.out.println(prefSum);
        System.out.println(count);


    }




}
