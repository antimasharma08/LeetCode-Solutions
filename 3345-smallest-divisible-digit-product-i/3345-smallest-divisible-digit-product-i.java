class Solution {
    public int smallestNumber(int n, int t) {
       int ans=-1;
        for(int i=n;;i++){
            int multiply=1;
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                multiply=multiply*digit;
                temp=temp/10;

            }
          
            if(multiply%t==0){
                 ans=i;
                 break;
            }

        }
        return ans;
        
    }
}