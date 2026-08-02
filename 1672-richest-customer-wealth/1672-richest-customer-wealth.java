
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
         int n=accounts[0].length;
      
       int max=Integer.MIN_VALUE;
       
         for(int i=0;i<m;i++){
            int totalsum=0;
        for(int j=0;j<n;j++){
            totalsum+=accounts[i][j];
        }
        if(totalsum>max){
            max=totalsum;
        }
        
       }
       return max;
    }
}
       
        