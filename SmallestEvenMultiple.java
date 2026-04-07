class Solution {
    public int smallestEvenMultiple(int n) {
        int a=2;
    
         if(n%a==0){
                a=n;


         }
         else{
          a=n*2;
         }
         return a;

        
    }
}
