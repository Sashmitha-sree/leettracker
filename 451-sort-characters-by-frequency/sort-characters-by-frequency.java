class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> Char=new ArrayList<>(map.keySet());

        Char.sort((a,b)->map.get(b)-map.get(a));

        StringBuilder result=new StringBuilder();

        for(int i=0;i<Char.size();i++){
            for(int j=0;j<map.get(Char.get(i));j++){
                result.append(Char.get(i));
            }
        }

        return result.toString();
    }
}