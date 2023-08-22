class H_Index {
    public int hIndex(int[] citations) {
       int n = citations.length;
       int[]freq = new int[n+1];

       for(int i=0;i<n;i++){
           if(citations[i]>citations.length){
               freq[citations.length]++;
           }else{
               freq[citations[i]]++;
           }
       }
        int cCount =0;
        for(int i=n;i>=0;i--){
            cCount+=freq[i];
            if(cCount>=i){
                return i;
            }
        }

        return 0;
    }

   // SOLUTION 2 
    
    public int hIndex(int[] citations){

        Arrays.sort(citations);
        int n = citations.length;
       
        int idx = 0 ;

        while(idx < n &&  n-idx >citations[idx]){
            idx++;
        }

    return n-idx;

    }




}
