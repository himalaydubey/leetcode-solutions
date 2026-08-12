class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp = num;
        int sum =0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                if(i==num){
                    continue;
                }
                sum+=i;
            }
        }
        return temp == sum;
    }
}
