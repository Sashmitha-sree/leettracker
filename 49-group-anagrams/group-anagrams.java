class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            String key = new String(s);
            

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }
        List<List<String>> result=new ArrayList<>();

        for(String Key: map.keySet()){
            result.add(map.get(Key));
        }

        return result;

        
    }
}