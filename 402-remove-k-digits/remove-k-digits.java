class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        if(num.length()==k){
            return "0";
        }
        for(char c:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();

        for(char i:stack){
            str.append(i);
        }

        while(str.length()>1 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
        }
        return str.toString();
    }
}