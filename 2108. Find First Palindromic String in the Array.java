class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            String b = words[i];
            String sb = new StringBuilder(b).reverse().toString();
            if(b.equals(sb)){
                return sb;
            }
        }
        return "";
    }
}
