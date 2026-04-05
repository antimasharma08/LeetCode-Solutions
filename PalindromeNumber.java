class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int r=0;
        int p=x;
        if(x<0){
            return false;
        }
        else{

        
      while(x>0){
        r=x%10;
      
     rev=rev*10+r;
       x=x/10;
        
      }
        }
      return rev==p;
      
    }
}
