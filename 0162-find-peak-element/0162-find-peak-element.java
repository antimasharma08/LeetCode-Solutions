class Solution {
    public int findPeakElement(int[] nums) {
       
        int ans=-1;
        for(int i=0;i<nums.length;i++){
          if((i==0 || nums[i]>nums[i-1]) && (i==nums.length-1 || nums[i]>nums[i+1]))
            ans=i;    
        }
        return ans;

    }
        
       
    }
