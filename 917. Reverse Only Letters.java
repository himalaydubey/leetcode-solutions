class Solution {
    public String reverseOnlyLetters(String s) {

        char[] sb = s.toCharArray();

        int left = 0;
        int right = sb.length-1;
        while(left<right){
            while(left<right && !Character.isLetter(sb[left])){
                left++;
            }

            while(left<right && !Character.isLetter(sb[right])){
                right--;
            }
            char temp = sb[left];
            sb[left] = sb[right];
            sb[right] = temp;
            left++;
            right--;
            
        }
       return new String(sb);
    }
}
