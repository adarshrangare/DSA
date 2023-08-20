class MergedSortedArray {
    public void merge(int[] num1, int m, int[] num2, int n) {
        
        int i=0,j=0,k=0;
        int [] merged = new int[n+m];

        while(i<m && j<n){

            if(num1[i]<num2[j]){

                merged[k] = num1[i];
                i++;

            } else{

                merged[k] = num2[j];
                j++;
            }
        k++;

        }

        while(i<m){
            merged[k++] = num1[i++];
        }
        while(j<n){
            merged[k++] = num2[j++];
        }


        

        for(int s=0;s<merged.length;s++){
            num1[s] = merged[s];
        }

    



    }
}
