class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String t = "";
        for(int i=0; i<arr.length; i++){
            String b = arr[i];
            String sb = new StringBuilder(b).reverse().toString();
            t+=sb;
            if(i<arr.length-1){
                t+=" ";
            }
        }
        return t;
    }
}
