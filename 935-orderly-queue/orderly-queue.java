class Solution {
    public String orderlyQueue(String s, int k) {
        
        if(k==1){
            String res=s;
            for(int i=1;i<res.length();i++){
                String b=s.substring(i)+s.substring(0,i);
                if(b.compareTo(res)<0){
                    res=b;
                }
            }
            return res;
        }
        
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}