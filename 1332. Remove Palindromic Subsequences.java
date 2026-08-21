class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder(s);
        String b = sb.reverse().toString();
        if(s.equals(b)){
            return 1;
        }else{
            return 2;
        }
    }
}
