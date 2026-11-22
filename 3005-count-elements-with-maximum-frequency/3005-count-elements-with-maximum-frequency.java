class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        int ans=0;
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            

            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=max;
            }else if(count==max){
                ans+=count;
            }
        }

        return ans; 
    }
}