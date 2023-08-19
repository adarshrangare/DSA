package ClassQuestionsAssignments;

import java.util.Scanner;

public class binarySearch {
    public static int binarySearchMethod(int[]arr,int start,int end,int k){

        int mid = (start+end)/2;

        if(start<=end) {

            if (arr[mid] == k) {
                return mid;
            } else if(arr[mid]>k){
                return binarySearchMethod(arr,start,mid-1,k);
            }else return binarySearchMethod(arr,mid+1,end,k);
        }

        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int []arr = {1,2,4,6,7,13,61,67,98};

        int k = 98;

        int index = binarySearchMethod(arr,0,arr.length-1,k) ;

        System.out.println(index);
    }
}
