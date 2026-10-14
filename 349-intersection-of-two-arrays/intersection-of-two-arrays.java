class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);

        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        if(set1.size()<set2.size()){
            for(int num:set1){
                if(set2.contains(num)){
                    res.add(num);
                }
            }
        }
        else{
            for(int num:set2){
                if(set1.contains(num)){
                    res.add(num);
                }
            }
        }
        int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
        
        // int size=Math.max(nums1.length,nums2.length);
        // int i=0;

        // for(int j=0;j<size;j++){
        //     if(nums1[i]==nums2[j]){
        //         res.add(nums1[i]);
        //     }
        //     if(nums[i]!=nums2[j] && nums2[j]>nums[i]){
        //         i++;
        //     }
        // }

        // return res
    }
}