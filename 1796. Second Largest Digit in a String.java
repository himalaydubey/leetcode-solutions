class Solution {
    public int secondHighest(String s) {
        s = s.replaceAll("[^0-9]","");
        char[] arr = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;  i++){
            int digit = arr[i] - '0';
            if(digit>max){
                smax = max;
                max = digit;
            }
            if(digit>smax && digit!=max){
                smax = digit;
            }
        }
        if(smax==Integer.MIN_VALUE){
            return -1;
        }else{
            return smax;
        }
    }
}
