class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag = true;
        boolean flag1 = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                flag = false;
            }
            if(nums[i]>nums[i+1]){
                flag1 = false;
            }
        }
        return flag || flag1;
        
    }
}
