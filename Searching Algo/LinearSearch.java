public class LinearSearch{

public static int linearSearch(int[]arr,int k){

  for(int i=0;i<arr.length;i++){
      if(arr[i]==k)return i;
  }

return -1;

}
}
