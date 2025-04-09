1684. Count the Number of Consistent Strings
  class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean allowedChar[]=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            allowedChar[allowed.charAt(i)-'a']=true;
        }
        for(String str:words){
            boolean consistent=true;
            for(int i=0;i<str.length();i++){
                if(!allowedChar[str.charAt(i)-'a']){
                    consistent=false;
                    break;
                }
            }
            if(consistent){
                count++;
            }
        }
        return count;
    }
}
