class Solution {
    public int lengthOfLastWord2(String s) {
    // This Approach is easier but space taken
      String [] arr = s.split("\\s+");

        return arr[arr.length-1].length();

      
      
    }
  
    public int lengthOfLastWord(String s) {
        boolean found = false;
        int count=0;

        

        if(s.length()==1){

            if(!(s.charAt(0)==' ')){
                return 1;
            }
        }


        for(int i=s.length()-1;i>=0;i--){
            
           if(Character.isAlphabetic(s.charAt(i))){
                
                count++;
                
                found = true;
                
                                               
            } 
            if(found && s.charAt(i)==' ' ){
                break;
            }
            
        }
        return count;
    }
}
