public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int lastLen=0;
        int len=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
                if(i==0){
                    temp=nums[i];
                    len++;
                    lastLen++;
                }else{
                    if(nums[i] > temp){
                        len++;
                        if(lastLen < len){
                            lastLen=len;
                        }
                    }else{
                        len=1;
                    }
                    temp=nums[i];
                }
        }
        return lastLen; 
    }
}
