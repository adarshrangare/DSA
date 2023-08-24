class LongestSubstringWithoutReapetingChar {
    public int lengthOfLongestSubstring(String s) {
       
        int left =0;
        int right =0;

        Set <Character> set = new HashSet<>();
        int maxWindow = 0;

        while(right<s.length()){
            char c = s.charAt(right);
            if(set.add(c)){
                
                maxWindow = Math.max(maxWindow,right-left+1);
                right++;
            }else{
                while(s.charAt(left)!=c){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(c);
                left++;
            }


        }
            return maxWindow;
    }

public int lengthOfLongestSubstringWithHashMap(String s){

    int right = 0;
    int left =0;
    int maxWindow =0;
    Map<Character,Integer> map = new HashMap<>();

    while(right<s.length()){

        char c = s.charAt(right);

        if(map.containsKey(c)){
            left = Math.max(left,map.get(c)+1);

        }
        map.put(c,right);

        maxWindow = Math.max(maxWindow,right-left+1);
        right++;
    }

    return maxWindow;

}

  
}
