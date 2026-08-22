class Solution {
    public boolean checkDivisibility(int n) {
        long temp = n;
        long sum = 0;
        long product = 1;
        while(n!=0){
            long digit = n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        long b = sum + product;  
         return temp%b==0;

    }
}
