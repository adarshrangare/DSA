class PlusOne {
    public int[] plusOne(int[] arr) {
        
        int carry = 1;
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            if((arr[i]+carry)>9){
                arr[i]= 0;
                carry = 1;
            } else{

                arr[i] = arr[i]+carry;
                carry =0;

            }

        }

        if(carry==1){
            arr = new int[n+1];
            arr[0] = 1;
        }

        return arr;
    }
}
