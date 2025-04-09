58. Length of Last Word
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        boolean foundword=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
                foundword=true;
            }
            else if(foundword && s.charAt(i)==' '){
                break;
            }
        }
        return count;
    }
}
