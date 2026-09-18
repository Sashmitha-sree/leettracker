class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int count=0;
        int i=0;
        int arr[]=new int[num_people];
        while(candies!=0){
            count++;
            if(i>=num_people){
                i=0;
            }
            if(count<candies){
                arr[i]+=count;
                candies-=count;
            }
            else{
                arr[i]+=candies;
                candies=0;
            }
            i++;
        }
        return arr;
    }
}