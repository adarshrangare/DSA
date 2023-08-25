class RomanToInteger {

    public int getNumber(char c){

        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X':return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;

        }
    }


    public int romanToInt(String s) {
        int result = 0;
        int previousValue=0;
        for(int i= s.length()-1;i>=0;i--){
            int currentValue = getNumber(s.charAt(i));

            if(previousValue > currentValue){
                result = result - currentValue;
            }
           else{ result +=  currentValue;
           }
            previousValue = currentValue;
        }

        return result ;
        
    }
}
