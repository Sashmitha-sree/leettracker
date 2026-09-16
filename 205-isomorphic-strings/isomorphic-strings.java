class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);

            if(map1.containsKey(a)){
                if(map1.get(a)!=b){
                    return false;
                }
            }
            else{
                map1.put(a,b);
            }

            if(map2.containsKey(b)){
                if(map2.get(b)!=a){
                    return false;
                }
            }
            else{
                map2.put(b,a);
            }

        }
        return true;



        // HashSet<Character> set1=new HashSet<>();
        // HashSet<Character> set2=new HashSet<>();

        // for(char a:s.toCharArray()){
        //     set1.add(a);
        // }
        // for(char a:t.toCharArray()){
        //     set2.add(a);
        // }
        // HashMap<Character,Character> map=new HashMap<>();
        // ArrayList<Character> list1=new ArrayList<>();
        // ArrayList<Character> list2=new ArrayList<>();

        // for(char val: set1){
        //     list1.add(val);
        // }
        // for(char val: set2){
        //     list2.add(val);
        // }
        // if(set1.size()==set2.size()){
        //     for(int i=0;i<set1.size();i++){
        //         map.put(list1.get(i),list2.get(i));
        //     }
        // }
        // else{
        //     return false;
        // }
        // char[] s1=s.toCharArray();
        // char[] s2=t.toCharArray();
        // for(int i=0;i<set1.size();i++){
        //     if(map.get(s1[i])!=s2[i]){
        //         return false;
        //     }
        // }
        // return true;
    }
}