class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<target.length(); i++){
            map1.put(target.charAt(i),map1.getOrDefault(target.charAt(i),0)+1);
        }
        int min = s.length();
        for(int i=0; i<target.length(); i++){
            char ch = target.charAt(i);
            int a = map.getOrDefault(ch,0);
            int b = map1.get(ch);
            int c = a/b;
            min = Math.min(min,c);
        }
        return min;
    }
}
