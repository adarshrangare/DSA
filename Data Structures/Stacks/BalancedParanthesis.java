package ClassQuestionsAssignments.DSA2.Stacks;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isValidParenthesis(String s) {

        Stack<Character> st = new Stack<>();

        if(s.length()<=1){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{' || c=='[' || c=='('){

                st.push(c);


            } else if(c==')'){

                if(!st.empty() && st.peek()=='(' ){
                    st.pop();
                } else return false;

            }
            else if(c=='}'){

                if(!st.empty() && st.peek()=='{' ){
                    st.pop();
                } else return false;


            }  else if(c==']'){

                if(!st.empty() && st.peek()=='[' ){
                    st.pop();
                } else return false;


            }



        }

        if(!st.empty()){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {

        String s = "{[()]}";

        if( isValidParenthesis(s)){
            System.out.println("It is Balanced Brackets");
        } else {
            System.err.println("It is NOT Balanced Brackets");
        }

    }
}
