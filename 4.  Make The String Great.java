1544. Make The String Great
  class Solution {
    public String makeGood(String s) {
        StringBuilder result=new StringBuilder();
        for(char ch : s.toCharArray()){
            int n=result.length();
            if(n>0 && Math.abs(result.charAt(n-1)-ch)==32){
                result.deleteCharAt(n-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
