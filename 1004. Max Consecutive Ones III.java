class Solution {
    public int longestOnes(int[] nums, int k) {
        int a = 0;
        int b = 0;
        int max = 0;
        for(int i=0;  i<nums.length; i++){
            if(nums[i] == 0){
                b++;
            }
            while(b>k){
                if(nums[a] == 0){
                    b--;
                }
                a++;
            }
         max = Math.max(max,i-a+1);
        }
        return max;
    }
}
