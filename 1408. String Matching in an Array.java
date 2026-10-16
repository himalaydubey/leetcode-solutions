class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(words[i].contains(words[j]) && i!=j){
                    if(!list.contains(words[j])){
                    list.add(words[j]);
                    }
                }
            }
        }
        return list;
    }
}
