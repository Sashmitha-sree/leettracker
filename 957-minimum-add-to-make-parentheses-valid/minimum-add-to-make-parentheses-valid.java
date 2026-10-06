class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
       
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(')');
                }
            }
          
        }

        return st.size();
        

    }
}