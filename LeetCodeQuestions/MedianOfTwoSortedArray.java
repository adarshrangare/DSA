package LeetCodeQuestions;
// https://leetcode.com/problems/median-of-two-sorted-arrays/solutions/3489494/c-java-python-javascript-o-log-min-m-n-iterative-solution-with-explanation/
public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        int n = num1.length;
        int m = num2.length;
        int i=0,j=0,k=0;

        int [] merged = new int[n+m];

        while(i<n && j<m){

            if(num1[i]<num2[j]){
                merged[k] = num1[i];
                i++;
            } else{
                merged[k] = num2[j];
                j++;
            }
            k++;

        }

        while(i<n){
            merged[k] = num1[i];
            i++;
            k++;
        }

        while(j<m){
            merged[k] = num2[j];
            j++;
            k++;
        }
        double median = 0.00000;
        if(merged.length%2==0){
            int sum = merged[merged.length/2] + merged[(merged.length/2)-1];
            median = (double) sum /2;
        } else{
            double sum = (double) merged[merged.length/2];
            median = sum;
        }




        return median;

    }



    public static void main(String[] args) {

        int [] num1 = {1,2};
        int [] num2 = {3,4};


        System.out.println(findMedianSortedArrays(num1,num2));

    }
}
