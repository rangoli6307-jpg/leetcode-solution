class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        int count = 0;
       for(char ch = 'a'; ch <= 'z'; ch++){
        for(int i  = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ch){
                count ++;
                break;
            }
        }
       } 
       if(count == 26){
        return true; 
       }
       else 
       return false;
    }
}