class Solution {
        int helper(int n){
        int product = 1;
        while(n!=0){
            int digit = n%10;
            product*=digit;
            n/=10;
        }
        return product;
        }
     public int smallestNumber(int n, int t) {
        for(int i=n; ;i++){
            if(helper(i)%t==0){
                return i;
            }
        }
        
    }
}
