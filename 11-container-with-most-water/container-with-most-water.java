class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int i=0;
        int j=len-1;
        int maxarea=Math.min(height[i],height[j])*(j-i);
        while(i<j){
            if(height[i]<height[j]){
                i++;
            }
            else if(height[j]<=height[i]){
                j--;
            }
            int area=Math.min(height[i],height[j])*(j-i);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
        
    }
}