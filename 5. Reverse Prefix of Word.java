2000. Reverse Prefix of Word
  class Solution {
    public String reversePrefix(String word, char ch) {
        int end=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                end=i;
                break;
            }
        }
        int i=0;
        char chars[]=word.toCharArray();
        if(end!=-1){
            while(i<=end){
                char temp=chars[i];
                chars[i]=chars[end];
                chars[end]=temp;
                i++;
                end--;
            }    
        }
        else{
            return word;
        }
        return new String(chars);
    }    
}
