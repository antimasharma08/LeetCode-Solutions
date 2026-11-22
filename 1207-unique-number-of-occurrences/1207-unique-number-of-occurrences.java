class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int count=0;
        boolean[] visited=new boolean[arr.length];
         boolean[] check=new boolean[arr.length+1];
        for(int i=0;i<arr.length;i++){
                if(visited[i]){
                    continue;
                }
        
        count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                visited[j]=true;
                count++;
            }
        }
        
        if(check[count]){
            return false;
        }
        check[count]= true;
    }
    return true;
}
}